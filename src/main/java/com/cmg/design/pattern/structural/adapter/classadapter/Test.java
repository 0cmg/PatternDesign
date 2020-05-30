package com.cmg.design.pattern.structural.adapter.classadapter;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/30 10:02
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreterTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
