package com.cmg.design.pattern.behavioral.templatemethod;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/2 21:49
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start------");
        ACourse patternDesignCourse = new PatternDesignCourse();
        patternDesignCourse.makeCourse();
        System.out.println("后端设计模式课程end------");

        System.out.println("前端课程start------");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end------");
    }
}
