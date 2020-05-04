package com.cmg.design.pattern.creational.factorymethod;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/4 11:02
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        Video video = videoFactory.getInstance();
        video.pruduce();
    }
}
