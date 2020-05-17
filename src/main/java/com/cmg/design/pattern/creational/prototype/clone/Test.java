package com.cmg.design.pattern.creational.prototype.clone;

import com.cmg.design.pattern.creational.singleton.hungry.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/17 16:48
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩奇", birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig1);
//
//        pig1.getBirthday().setTime(66666666666666666L);
//        System.out.println(pig1);
//        System.out.println(pig2);

        HungrySingleton instance = HungrySingleton.getInstance();
        Method method = instance.getClass().getDeclaredMethod("clone");

        method.setAccessible(true);

        HungrySingleton cloneInstance = (HungrySingleton) method.invoke(instance);

        System.out.println(instance);
        System.out.println(cloneInstance);

    }
}
