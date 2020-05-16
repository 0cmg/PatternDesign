package com.cmg.design.pattern.creational.singleton.lazy;

/**
 * @ClassName LazySingleton
 * @Author cmg
 * @Date 2020/5/16 16:48
 * @Description TODO
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){
        if(lazySingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    /*public synchronized static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }*/
    /*public static LazySingleton getInstance(){
        synchronized(LazySingleton.class){
            if(lazySingleton == null){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }*/
}
