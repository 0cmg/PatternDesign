package com.cmg.design.pattern.creational.builder;

/**
 * @ClassName ActuralCourseBuilder
 * @Author cmg
 * @Date 2020/5/8 22:02
 * @Description TODO
 **/
public class ActuralCourseBuilder extends BaseCourseBuilder {
    Course course  = new Course();
    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    public Course makeCourse() {
        return course;
    }

}
