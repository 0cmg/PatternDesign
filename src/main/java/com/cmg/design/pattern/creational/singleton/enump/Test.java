package com.cmg.design.pattern.creational.singleton.enump;

import com.cmg.design.pattern.creational.singleton.lazy.LazyDoubleCheckSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/16 21:48
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SingelFile"));
//        oos.writeObject(instance);
//
//        File file  = new File("SingelFile");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        EnumInstance newInstance = (EnumInstance)ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());

//        Class objectClass = EnumInstance.class;
//
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//
//        EnumInstance instance = EnumInstance.getInstance();
//        EnumInstance newInstance = (EnumInstance) constructor.newInstance("cmg",666);

        EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();
    }
}
