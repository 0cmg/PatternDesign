package com.cmg.design.pattern.structural.decorator.V2;

/**
 * @ClassName BatterCakeWithSausageDecorator
 * @Author cmg
 * @Date 2020/5/28 22:05
 * @Description TODO
 **/
public class SausageDecorator extends ABatterCakeDecorator {
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+3;
    }
}
