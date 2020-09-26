package com.cmg.design.pattern.creational.factorymethod.bugstack;

import java.util.Map;

/**
 * @ClassName: AwareReq
 * @Description:
 * @Author: cmg
 * @Date: 2020/9/26 14:43
 * @Version: V1.0
 **/
public class AwardReq {
    //用户ID
    private String uId;
    //奖品类型（可用枚举类型定义）；1优惠券、实物商品、3第三方兑换卡(爱奇艺)
    private Integer awardType;
    //奖品编号；sku、couponNumber、cardId
    private String awardNumber;
    //业务ID，防重
    private String bizId;
    private Map<String, String> extMap;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }
}
