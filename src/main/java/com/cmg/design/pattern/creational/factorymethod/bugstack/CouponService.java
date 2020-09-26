package com.cmg.design.pattern.creational.factorymethod.bugstack;

/**
 * @ClassName: CouponService
 * @Description:
 * @Author: cmg
 * @Date: 2020/9/26 15:15
 * @Version: V1.0
 **/
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid){
        System.out.format("模拟发送优惠券一张: 用户标识:{%s}, 会员号:{%s} , 唯一标识:{%s}",uId, couponNumber, uuid);
        return new CouponResult("0000", "发放成功");
    }
}
