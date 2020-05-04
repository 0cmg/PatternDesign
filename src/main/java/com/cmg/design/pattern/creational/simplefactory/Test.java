package com.cmg.design.pattern.creational.simplefactory;

import com.cmg.design.principle.openclose.JavaCourse;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/4 11:02
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.pruduce();
//        Video video = new VideoFactory().getInstance("python");
//        if(video == null){
//            return;
//        }
//        video.pruduce();
        Video video = new VideoFactory().getInstance(new JavaVideo().getClass());
        if (video == null){
            return;
        }
        video.pruduce();
    }
}
