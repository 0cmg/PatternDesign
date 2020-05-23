package com.cmg.design.pattern.structural.facade;

/**
 * @ClassName ShippingService
 * @Author cmg
 * @Date 2020/5/23 16:30
 * @Description TODO
 **/
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"进入物流系统！");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
