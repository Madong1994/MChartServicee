package com.m.im.common.generator;

public class Generator {

	public static void main(String[] args) {
		
		String modelPackage = "com.m.im.common";
		
		String dbHost = "127.0.0.1";
		String dbName = "mchart";
		String dbUser = "root";
		String dbPassword = "123456";
		
		new JGenerator(modelPackage, dbHost, dbName, dbUser, dbPassword).doGenerate();

	}

}
