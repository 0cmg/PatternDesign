package com.cmg.design.pattern.creational.singleton.lazy;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/16 16:50
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        Runnable target;
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program End!");

    }
}
