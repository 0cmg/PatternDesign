package com.cmg.design.pattern.creational.singleton.hungry;

import com.cmg.design.pattern.creational.singleton.lazy.LazyDoubleCheckSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/16 16:50
 * @Description TODO
 **/
public class Test{
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         *
         */
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SingelFile"));
//
//        oos.writeObject(instance);
//
//        File file  = new File("SingelFile");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newInstance = (HungrySingleton)ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);
        /**
         * 单例构造器禁止反射调用
         */
//        Class objectClass = HungrySingleton.class;
        Class objectClass = LazyDoubleCheckSingleton.class;

        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);

//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton)constructor.newInstance();
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);

        System.out.println(instance == newInstance);

    }
}
