package com.cmg.design.pattern.creational.builder;

/**
 * @ClassName Coach
 * @Author cmg
 * @Date 2020/5/8 22:04
 * @Description TODO
 **/
public class Coach {
    private BaseCourseBuilder courseBuilder ;

    public void setCourseBuilder(BaseCourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String courseVideo, String coursePPT, String courseArticle, String courseQA){
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
