package com.cmg.design.pattern.structural.proxy;

/**
 * @ClassName Order
 * @Author cmg
 * @Date 2020/6/1 21:11
 * @Description TODO
 **/
public class Order {
    private Object OrderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return OrderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        OrderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
