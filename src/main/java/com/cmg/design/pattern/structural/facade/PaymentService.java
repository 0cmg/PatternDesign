package com.cmg.design.pattern.structural.facade;

/**
 * @ClassName PaymentsService
 * @Author cmg
 * @Date 2020/5/23 16:29
 * @Description TODO
 **/
public class PaymentService{
    public boolean pay(PointsGift pointsGift){
        System.out.println("支付"+pointsGift.getName()+"积分成功！");
        return true;
    }
}
