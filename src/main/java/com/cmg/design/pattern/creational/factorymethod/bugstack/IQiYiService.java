package com.cmg.design.pattern.creational.factorymethod.bugstack;

/**
 * @ClassName: IQiYiService
 * @Description:
 * @Author: cmg
 * @Date: 2020/9/26 15:11
 * @Version: V1.0
 **/
public class IQiYiService {
    public void grantToken(String bindMobileNumber, String cardId){
        System.out.format("模拟发放爱奇艺会员卡一张: 绑定电话:{%s}, 卡号:{%s} ", bindMobileNumber, cardId);
    }
}
