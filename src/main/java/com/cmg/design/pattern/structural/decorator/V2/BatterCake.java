package com.cmg.design.pattern.structural.decorator.V2;

/**
 * @ClassName BatterCake
 * @Author cmg
 * @Date 2020/5/28 22:08
 * @Description TODO
 **/
public class BatterCake extends ABatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
