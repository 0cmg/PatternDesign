package com.cmg.design.pattern.behavioral.mediator;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/6 20:23
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        User geely = new User("Geely");
        User tom = new User("Tom");

        geely.sendMessage("Hey! Tom! let's learn Design Pattern!");
        tom.sendMessage("OK! Geely");
    }
}
