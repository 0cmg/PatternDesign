package com.cmg.design.pattern.behavioral.observer;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/6 16:48
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");

        Teacher teacher1 = new Teacher("Cmg1");
        Teacher teacher2 = new Teacher("Cmg2");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //业务逻辑
        Question question = new Question();
        question.setUserName("Geely");
        question.setQuestionContent("构造器如何编写？");

        course.produceQestion(course,question);
    }
}
