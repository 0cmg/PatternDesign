package com.cmg.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @ClassName StudyGroup
 * @Author cmg
 * @Date 2020/6/6 20:23
 * @Description TODO
 **/
public class StudyGroup {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+"["+user.getName()+"]: "+message);
    }
}
