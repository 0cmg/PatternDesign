package com.cmg.design.pattern.behavioral.observer;

/**
 * @ClassName Question
 * @Author cmg
 * @Date 2020/6/6 16:40
 * @Description TODO
 **/
public class Question {
    private String userName;
    private String QuestionContent;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setQuestionContent(String questionContent) {
        QuestionContent = questionContent;
    }

    public String getUserName() {
        return userName;
    }

    public String getQuestionContent() {
        return QuestionContent;
    }
}
