package com.cmg.design.pattern.creational.singleton.threadlocal;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/17 15:41
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("1--->"+ThreadLocalSingleton.getInstance());
        System.out.println("2--->"+ThreadLocalSingleton.getInstance());
        System.out.println("3--->"+ThreadLocalSingleton.getInstance());
        System.out.println("4--->"+ThreadLocalSingleton.getInstance());
        System.out.println("5--->"+ThreadLocalSingleton.getInstance());
        System.out.println("6--->"+ThreadLocalSingleton.getInstance());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program End!");
    }
}
