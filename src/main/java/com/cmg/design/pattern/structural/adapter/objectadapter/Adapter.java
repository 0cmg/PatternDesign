package com.cmg.design.pattern.structural.adapter.objectadapter;

/**
 * @ClassName Adapter
 * @Author cmg
 * @Date 2020/5/30 10:00
 * @Description TODO
 **/
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();
    }
}
