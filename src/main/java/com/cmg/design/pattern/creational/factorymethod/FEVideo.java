package com.cmg.design.pattern.creational.factorymethod;

/**
 * @ClassName FEVideo
 * @Author cmg
 * @Date 2020/5/4 16:17
 * @Description TODO
 **/
public class FEVideo extends Video {
    @Override
    public void pruduce() {
        System.out.println("录制FE视频课程！");
    }
}
