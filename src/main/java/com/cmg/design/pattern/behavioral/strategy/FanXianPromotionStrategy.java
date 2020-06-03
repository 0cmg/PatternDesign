package com.cmg.design.pattern.behavioral.strategy;

/**
 * @ClassName FanXianPromotionStrategy
 * @Author cmg
 * @Date 2020/6/3 21:18
 * @Description TODO
 **/
public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到用户的余额中");
    }
}
