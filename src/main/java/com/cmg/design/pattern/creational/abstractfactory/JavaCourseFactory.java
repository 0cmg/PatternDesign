package com.cmg.design.pattern.creational.abstractfactory;

/**
 * @ClassName JavaCourseFactory
 * @Author cmg
 * @Date 2020/5/8 21:00
 * @Description TODO
 **/
public class JavaCourseFactory implements CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
