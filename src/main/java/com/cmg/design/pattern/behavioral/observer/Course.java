package com.cmg.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @ClassName Course
 * @Author cmg
 * @Date 2020/6/6 16:30
 * @Description TODO
 **/
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQestion(Course course, Question question){
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
