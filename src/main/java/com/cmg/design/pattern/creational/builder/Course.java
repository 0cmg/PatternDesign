package com.cmg.design.pattern.creational.builder;

/**
 * @ClassName Course
 * @Author cmg
 * @Date 2020/5/8 21:56
 * @Description TODO
 **/
public class Course {
    private String courseName;
    private String courseVideo;
    private String coursePPT;
    private String courseArticle;
    private String courseQA;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
