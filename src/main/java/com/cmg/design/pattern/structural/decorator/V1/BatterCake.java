package com.cmg.design.pattern.structural.decorator.V1;

/**
 * @ClassName BatterCake
 * @Author cmg
 * @Date 2020/5/28 21:52
 * @Description TODO
 **/
public class BatterCake {
    protected String getDesc(){
        return "煎饼";
    }

    protected int cost(){
        return 8;
    }
}
