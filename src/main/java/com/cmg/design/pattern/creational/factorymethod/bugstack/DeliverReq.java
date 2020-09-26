package com.cmg.design.pattern.creational.factorymethod.bugstack;

/**
 * @ClassName: DeliverReq
 * @Description:
 * @Author: cmg
 * @Date: 2020/9/26 15:19
 * @Version: V1.0
 **/
public class DeliverReq {
    // 用户姓名
    private String userName;
    // 用户手机
    private String userPhone;
    // 商品SKU
    private String sku;
    // 订单ID
    private String orderId;
    // 收货人姓名
    private String consigneeUserName;
    // 收货人手机
    private String consigneeUserPhone;
    // 收获人地址
    private String consigneeUserAddress;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getConsigneeUserName() {
        return consigneeUserName;
    }

    public void setConsigneeUserName(String consigneeUserName) {
        this.consigneeUserName = consigneeUserName;
    }

    public String getConsigneeUserPhone() {
        return consigneeUserPhone;
    }

    public void setConsigneeUserPhone(String consigneeUserPhone) {
        this.consigneeUserPhone = consigneeUserPhone;
    }

    public String getConsigneeUserAddress() {
        return consigneeUserAddress;
    }

    public void setConsigneeUserAddress(String consigneeUserAddress) {
        this.consigneeUserAddress = consigneeUserAddress;
    }
}
