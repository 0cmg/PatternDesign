package com.cmg.design.pattern.creational.builder;

/**
 * @ClassName BaseCourseBuilder
 * @Author cmg
 * @Date 2020/5/8 21:58
 * @Description TODO
 **/
public abstract class BaseCourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
