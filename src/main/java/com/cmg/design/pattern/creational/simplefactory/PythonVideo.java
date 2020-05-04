package com.cmg.design.pattern.creational.simplefactory;

/**
 * @ClassName PythonVideo
 * @Author cmg
 * @Date 2020/5/4 11:01
 * @Description TODO
 **/
public class PythonVideo extends Video{
    @Override
    public void pruduce() {
        System.out.println("录制Python视频课程！");
    }
}
