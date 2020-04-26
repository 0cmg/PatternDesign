package com.cmg.design.principle.openclose;

public class test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(123,"java课程",1235);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
        System.out.println("课程ID："+javaCourse.getId()+",课程名称："+javaCourse.getName()+",课程原价："+javaCourse.getOriginPrice()+",课程折后价格："+javaCourse.getPrice());
    }
}
