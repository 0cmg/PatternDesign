package com.cmg.design.pattern.structural.decorator.V2;

/**
 * @ClassName BatterCakeWithEggDecorator
 * @Author cmg
 * @Date 2020/5/28 22:04
 * @Description TODO
 **/
public class EggDecorator extends ABatterCakeDecorator {
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
