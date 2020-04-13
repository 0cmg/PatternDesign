package com.cmg.design.principle.openclose;

public class test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(123,"java课程",1235);
        System.out.println("课程ID："+javaCourse.getId()+",课程名称："+javaCourse.getName()+",课程价格："+javaCourse.getPrice());
    }
}
