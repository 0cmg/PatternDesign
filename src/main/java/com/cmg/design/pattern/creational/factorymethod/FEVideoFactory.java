package com.cmg.design.pattern.creational.factorymethod;

/**
 * @ClassName FEVideoFactory
 * @Author cmg
 * @Date 2020/5/4 16:18
 * @Description TODO
 **/
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getInstance() {
        return new FEVideo();
    }
}
