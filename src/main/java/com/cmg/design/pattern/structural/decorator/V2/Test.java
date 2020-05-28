package com.cmg.design.pattern.structural.decorator.V2;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/28 22:06
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();

        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);

        aBatterCake = new SausageDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc()+" 价格是："+aBatterCake.cost());
    }
}
