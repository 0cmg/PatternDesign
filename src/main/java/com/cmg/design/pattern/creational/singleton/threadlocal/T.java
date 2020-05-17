package com.cmg.design.pattern.creational.singleton.threadlocal;

/**
 * @ClassName T
 * @Author cmg
 * @Date 2020/5/17 15:41
 * @Description TODO
 **/
public class T implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"--->"+instance);
    }
}
