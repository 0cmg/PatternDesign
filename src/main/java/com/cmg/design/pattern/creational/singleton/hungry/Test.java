package com.cmg.design.pattern.creational.singleton.hungry;

import java.io.*;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/16 16:50
 * @Description TODO
 **/
public class Test{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        OutputStream out;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SingelFile"));

        oos.writeObject(instance);

        File file  = new File("SingelFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton newInstance = (HungrySingleton)ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
