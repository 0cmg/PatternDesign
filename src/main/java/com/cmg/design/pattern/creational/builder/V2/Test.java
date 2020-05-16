package com.cmg.design.pattern.creational.builder.V2;

import org.codehaus.jackson.map.util.ISO8601Utils;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/8 22:22
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精品课程").buildCourseVideo("Java设计模式精品课程视频").buildCoursePPT("Java设计模式精品课程PPT").build();
        System.out.println(course);
    }
}
