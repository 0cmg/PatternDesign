package com.cmg.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Teacher
 * @Author cmg
 * @Date 2020/6/6 16:42
 * @Description TODO
 **/
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question)arg;
        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程收到了一个"+question.getUserName()+"提交的问题："+question.getQuestionContent());
    }
}
