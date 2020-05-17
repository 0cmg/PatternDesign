package com.cmg.design.pattern.creational.singleton.threadlocal;

/**
 * @ClassName ThreadLocalSingleton
 * @Author cmg
 * @Date 2020/5/17 15:35
 * @Description TODO
 **/
public class ThreadLocalSingleton {
    private static ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    private ThreadLocalSingleton(){

    }

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingletonThreadLocal.get();
    }
}
