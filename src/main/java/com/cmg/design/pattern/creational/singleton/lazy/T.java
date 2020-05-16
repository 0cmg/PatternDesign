package com.cmg.design.pattern.creational.singleton.lazy;

/**
 * @ClassName T
 * @Author cmg
 * @Date 2020/5/16 16:51
 * @Description TODO
 **/
public class T implements Runnable {
    public void run() {
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
