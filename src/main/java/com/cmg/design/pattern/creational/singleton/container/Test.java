package com.cmg.design.pattern.creational.singleton.container;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/17 15:21
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program End!");
    }
}
