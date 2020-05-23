package com.cmg.design.pattern.structural.facade;

/**
 * @ClassName PointsGiftExchange
 * @Author cmg
 * @Date 2020/5/23 16:35
 * @Description TODO
 **/
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();


    public void gitfExchange(PointsGift pointsGift){
        if(qualifyService.isValiable(pointsGift)){
            if(paymentService.pay(pointsGift)){
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，返回的订单号是："+shippingOrderNo);
            }
        }

    }
}
