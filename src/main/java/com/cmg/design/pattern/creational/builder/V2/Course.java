package com.cmg.design.pattern.creational.builder.V2;

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

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.courseVideo = courseBuilder.courseVideo;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
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

    public static class CourseBuilder{
        private String courseName;
        private String courseVideo;
        private String coursePPT;
        private String courseArticle;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseArticle(String courseArticle) {
            this.courseArticle =courseArticle;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA =courseQA;
            return this;
        }

        public Course build(){
            return new Course(this);
        }
    }
}
