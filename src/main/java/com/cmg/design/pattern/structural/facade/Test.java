package com.cmg.design.pattern.structural.facade;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/23 16:40
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤👕");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.gitfExchange(pointsGift);
    }
}
