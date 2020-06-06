package com.cmg.design.pattern.behavioral.strategy;

/**
 * @ClassName PromotionStrategyActivity
 * @Author cmg
 * @Date 2020/6/3 21:24
 * @Description TODO
 **/
public class PromotionStrategyActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionStrategyActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
