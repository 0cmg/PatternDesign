package com.cmg.design.pattern.creational.builder;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/8 22:12
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        BaseCourseBuilder courseBuilder = new ActuralCourseBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java设计模式精品课程","Java设计模式精品课程视频","Java设计模式精品课程PPT","Java设计模式精品课程手记","Java设计模式精品课程问答");
        System.out.println(course);
    }
}
