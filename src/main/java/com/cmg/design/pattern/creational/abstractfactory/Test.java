package com.cmg.design.pattern.creational.abstractfactory;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/8 21:01
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
