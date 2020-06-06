package com.cmg.design.pattern.behavioral.strategy;

/**
 * @ClassName LiJianPromotionStrategy
 * @Author cmg
 * @Date 2020/6/3 21:19
 * @Description TODO
 **/
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程价格直接减去配置的价格");
    }
}
