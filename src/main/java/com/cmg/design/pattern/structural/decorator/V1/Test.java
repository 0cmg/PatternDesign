package com.cmg.design.pattern.structural.decorator.V1;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/28 21:57
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc()+" 价格是："+batterCake.cost());

        BatterCake batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc()+" 价格是："+batterCakeWithEgg.cost());

        BatterCake batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc()+" 价格是："+batterCakeWithEggSausage.cost());
    }
}
