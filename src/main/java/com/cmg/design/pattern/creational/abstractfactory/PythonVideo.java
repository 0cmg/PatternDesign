package com.cmg.design.pattern.creational.abstractfactory;


/**
 * @ClassName JavaVideo
 * @Author cmg
 * @Date 2020/5/8 20:58
 * @Description TODO
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频！");
    }
}
