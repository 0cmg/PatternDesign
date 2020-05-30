package com.cmg.design.pattern.structural.adapter.classadapter;

/**
 * @ClassName Adapter
 * @Author cmg
 * @Date 2020/5/30 10:00
 * @Description TODO
 **/
public class Adapter extends Adaptee implements Target {
    public void request() {
       super.adapteeRequest();
    }
}
