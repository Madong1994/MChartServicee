package com.m.im.mim.im.common.util;

import com.m.im.mim.im.common.handlers.BaseHandleImpl;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;

/**
 * @类名: ${CLASS_NAME}
 * @包名: com.m.im.mim.im.common.util
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @日期: 2017/10/10 10:58
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 */
public class MClassScaner {
    private static List<Class<?>> scanList = new ArrayList<Class<?>>();
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = forName("com.m.im.mim.im.common.handlers.impl.LoginHandler");
//        List<Class<T>> classList = new ArrayList<Class<T>>();
        List<Class<?>> list = MClassScaner.getScanList(BaseHandleImpl.class, BaseHandleImpl.class);
    }
    public static <T> List<Class<?>> getScanList(Class<T> clazzPackage , Class<T> pclazz){
        File scanfile = new File(clazzPackage.getResource("").getPath());
        scanSubClass(scanfile,pclazz);
        return scanList;
    }

    private static <T> void scanSubClass(File scanFile , Class<T> pclazz){

        if(scanFile.exists() && scanFile.isDirectory()){
            File[] files = scanFile.listFiles();
            for(File file: files){
                scanSubClass(file,pclazz);
            }
        }else {
            if(scanFile.getPath().indexOf(".class") != -1){
                String className = StringUtils.substringAfter(scanFile.getPath().replace(".class",""),"classes\\").replace("\\",".");//scanFile.getPath().replace(".class","").replace("\\",".");

                Class<T> classObject = null;
                try {
                    classObject = (Class<T>)Class.forName(className);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                boolean isfather = pclazz.isAssignableFrom(classObject);
                if(isfather){
                    classObject.asSubclass(pclazz);
                    if(className.equals(pclazz.getCanonicalName())){
                        //父类本身
                    }else {
                        scanList.add(classObject);
                    }
                }

            }
        }
    }
}
