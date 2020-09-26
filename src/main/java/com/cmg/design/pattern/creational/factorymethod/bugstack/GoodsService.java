package com.cmg.design.pattern.creational.factorymethod.bugstack;

import com.alibaba.fastjson.JSON;
/**
 * @ClassName: GoodsService
 * @Description: 模拟实物商品服务
 * @Author: cmg
 * @Date: 2020/9/26 15:20
 * @Version: V1.0
 **/
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.format("模拟发货实物商品一个，请求信息: {%s}", JSON.toJSONString(req));
        return true;
    }
}
