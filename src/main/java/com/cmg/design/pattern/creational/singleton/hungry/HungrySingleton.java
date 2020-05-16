package com.cmg.design.pattern.creational.singleton.hungry;

import java.io.Serializable;

/**
 * @ClassName StaticInnerClassSingleton
 * @Author cmg
 * @Date 2020/5/16 17:18
 * @Description TODO
 **/
public class HungrySingleton implements Serializable {
//    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private final static HungrySingleton hungrySingleton;
    static{
        hungrySingleton = new HungrySingleton();
    }
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    private HungrySingleton(){

    }
    private Object readResolve(){
        return hungrySingleton;
    }
}
