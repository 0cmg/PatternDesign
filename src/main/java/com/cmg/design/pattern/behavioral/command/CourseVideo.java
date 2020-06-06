package com.cmg.design.pattern.behavioral.command;

/**
 * @ClassName CourseVideo
 * @Author cmg
 * @Date 2020/6/6 17:48
 * @Description TODO
 **/
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name+"课程视频打开");
    }

    public void close(){
        System.out.println(this.name+"课程视频关闭");
    }
}
