package com.cmg.design.pattern.structural.decorator.V1;

/**
 * @ClassName BatterCakeWithEgg
 * @Author cmg
 * @Date 2020/5/28 21:55
 * @Description TODO
 **/
public class BatterCakeWithEgg extends BatterCake {
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
