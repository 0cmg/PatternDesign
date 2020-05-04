package com.cmg.design.pattern.creational.factorymethod;

/**
 * @ClassName JavaVideoFactory
 * @Author cmg
 * @Date 2020/5/4 16:15
 * @Description TODO
 **/
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getInstance() {
        return new JavaVideo();
    }
}
