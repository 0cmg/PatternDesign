package com.cmg.design.pattern.behavioral.strategy;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/3 21:25
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        PromotionStrategyActivity promotionStrategyActivity618 = new PromotionStrategyActivity(new LiJianPromotionStrategy());
        PromotionStrategyActivity promotionStrategyActivity1111 = new PromotionStrategyActivity(new FanXianPromotionStrategy());

        promotionStrategyActivity618.executePromotionStrategy();
        promotionStrategyActivity1111.executePromotionStrategy();
    }
}
