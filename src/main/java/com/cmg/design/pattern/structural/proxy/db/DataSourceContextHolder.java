package com.cmg.design.pattern.structural.proxy.db;

/**
 * @ClassName DataSourceContextHolder
 * @Author cmg
 * @Date 2020/6/1 21:25
 * @Description TODO
 **/
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HANDLER = new ThreadLocal<String>();
    public static void setDBType(String dbType){
        CONTEXT_HANDLER.set(dbType);
    }
    public static String getDBType(){
        return (String)CONTEXT_HANDLER.get();
    }

    public static void clearDBType(){
        CONTEXT_HANDLER.remove();
    }
}
