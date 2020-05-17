package com.cmg.design.pattern.creational.singleton.container;

/**
 * @ClassName T
 * @Author cmg
 * @Date 2020/5/17 15:22
 * @Description TODO
 **/
public class T implements Runnable {
    @Override
    public void run() {
        ContainerSingleton.pushInstance("Object", new Object());
        Object instance = ContainerSingleton.getInstance("Object");
        System.out.println(Thread.currentThread().getName()+"--->"+instance);
    }
}
