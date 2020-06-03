package com.cmg.design.pattern.behavioral.strategy;

/**
 * @ClassName ManJianPromotionStrategy
 * @Author cmg
 * @Date 2020/6/3 21:19
 * @Description TODO
 **/
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200-20元");
    }
}
