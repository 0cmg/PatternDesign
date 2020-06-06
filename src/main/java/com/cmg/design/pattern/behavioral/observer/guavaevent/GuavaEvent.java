package com.cmg.design.pattern.behavioral.observer.guavaevent;

import com.google.common.eventbus.Subscribe;

/**
 * @ClassName GuavaEvent
 * @Author cmg
 * @Date 2020/6/6 16:59
 * @Description TODO
 **/
public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是："+str);
    }
}
