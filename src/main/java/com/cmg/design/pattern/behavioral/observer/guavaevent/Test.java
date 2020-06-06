package com.cmg.design.pattern.behavioral.observer.guavaevent;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/6 17:00
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("post的内容");
    }
}
