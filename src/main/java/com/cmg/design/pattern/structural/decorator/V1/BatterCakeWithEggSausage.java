package com.cmg.design.pattern.structural.decorator.V1;

/**
 * @ClassName BatterCakeWithEggSausage
 * @Author cmg
 * @Date 2020/5/28 21:56
 * @Description TODO
 **/
public class BatterCakeWithEggSausage extends BatterCakeWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+3;
    }
}
