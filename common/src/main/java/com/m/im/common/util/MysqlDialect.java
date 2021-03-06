package com.m.im.common.util;

import com.alibaba.druid.filter.stat.StatFilter;
import com.jfinal.kit.PathKit;
import com.jfinal.plugin.druid.DruidPlugin;
import com.m.im.common.util.DbDialect;
import com.m.im.common.util.FileUtils;

import java.io.File;
import java.util.Map;

public class MysqlDialect extends DbDialect {

	@Override
	public String forShowTable() {
		return "show tables;";
	}

	@Override
	public String forSelect(String tableName) {
		return String.format("SELECT * FROM `%s`", tableName);
	}

	@Override
	public String forDelete(String tableName) {
		return String.format("DELETE FROM `%s`", tableName);
	}

	@Override
	public String forSelectCount(String tableName) {
		return String.format("SELECT COUNT(*) FROM `%s`", tableName);
	}

	@Override
	public String forPaginateFrom(String tableName, String where) {
		StringBuilder from = new StringBuilder(" FROM ");
		from.append("`" + tableName + "`");

		if (where != null && !"".equals(where.trim())) {
			from.append(" WHERE " + where);
		}
		return from.toString();
	}

	@Override
	public String forInsertWebName(String tablePrefix) {
		return "INSERT INTO `" + tablePrefix + "option` (option_key, option_value) VALUES ('web_name', ? )";
	}

	@Override
	public String forInsertFirstUser(String tablePrefix) {
		return "INSERT INTO `" + tablePrefix + "user` (username, password, salt, role, status, created) "
				+ "VALUES (?,?,?,?,?,?)";
	}

	@Override
	public DruidPlugin createDuidPlugin(String dbHost, String dbHostPort, String dbName, String dbUser,
			String dbPassword) {

		String jdbc_url = "jdbc:mysql://" + dbHost + ":" + dbHostPort + "/" + dbName + "?" + "useUnicode=true&"
				+ "characterEncoding=utf8&" + "zeroDateTimeBehavior=convertToNull";

		DruidPlugin druidPlugin = new DruidPlugin(jdbc_url, dbUser, dbPassword);
		druidPlugin.addFilter(new StatFilter());

		return druidPlugin;
	}

	public String doTableConvert(String sql) {
		for (Map.Entry<String, String> entry : tableMapping.entrySet()) {
			sql = sql.replace(" " + entry.getKey() + " ", String.format(" `%s` ", entry.getValue()));
			sql = sql.replace(" " + entry.getKey() + ",", String.format(" `%s`,", entry.getValue()));
			sql = sql.replace(" " + entry.getKey() + ".", String.format(" `%s`.", entry.getValue()));
			sql = sql.replace("," + entry.getKey() + " ", String.format(",`%s` ", entry.getValue()));
			sql = sql.replace("," + entry.getKey() + ".", String.format(",`%s`.", entry.getValue()));
			// sql = sql.replace(entry.getKey() + "`", entry.getValue() + "`");
		}
		return sql;
	}

	@Override
	public String forInstall(String tablePrefix) {

		String SqlFilePath = PathKit.getWebRootPath() + "/WEB-INF/install/sqls/mysql.sql";
		String sql_text = FileUtils.readString(new File(SqlFilePath)).replace("{table_prefix}", tablePrefix)
				.replace("{charset}", "utf8mb4");

		return sql_text;
	}

}
