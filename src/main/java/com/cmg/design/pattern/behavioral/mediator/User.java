package com.cmg.design.pattern.behavioral.mediator;

/**
 * @ClassName User
 * @Author cmg
 * @Date 2020/6/6 20:23
 * @Description TODO
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        StudyGroup.showMessage(this,message);
    }
}
