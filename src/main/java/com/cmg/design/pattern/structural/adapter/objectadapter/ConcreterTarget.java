package com.cmg.design.pattern.structural.adapter.objectadapter;

/**
 * @ClassName ConcreterTarget
 * @Author cmg
 * @Date 2020/5/30 10:04
 * @Description TODO
 **/
public class ConcreterTarget implements Target {
    public void request() {
        System.out.println("ConcreterTarget目标的方法");
    }
}
