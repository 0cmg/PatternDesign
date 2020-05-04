package com.cmg.design.pattern.creational.factorymethod;

/**
 * @ClassName PythonVideoFactory
 * @Author cmg
 * @Date 2020/5/4 16:15
 * @Description TODO
 **/
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getInstance() {
        return new PythonVideo();
    }
}
