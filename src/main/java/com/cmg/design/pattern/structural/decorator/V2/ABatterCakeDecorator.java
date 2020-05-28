package com.cmg.design.pattern.structural.decorator.V2;

/**
 * @ClassName ABatterCakeDecorator
 * @Author cmg
 * @Date 2020/5/28 22:02
 * @Description TODO
 **/
public class ABatterCakeDecorator extends ABatterCake {
    private ABatterCake aBatterCake;

    public ABatterCakeDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    @Override
    protected String getDesc() {
        return this.aBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBatterCake.cost();
    }
}
