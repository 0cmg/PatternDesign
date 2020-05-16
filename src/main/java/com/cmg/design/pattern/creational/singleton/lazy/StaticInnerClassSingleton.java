package com.cmg.design.pattern.creational.singleton.lazy;

/**
 * @ClassName StaticInnerClassSingleton
 * @Author cmg
 * @Date 2020/5/16 17:18
 * @Description TODO
 **/
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){

    }
}
