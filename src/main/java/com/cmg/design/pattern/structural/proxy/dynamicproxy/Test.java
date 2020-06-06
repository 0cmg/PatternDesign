package com.cmg.design.pattern.structural.proxy.dynamicproxy;

import com.cmg.design.pattern.structural.proxy.IOrderService;
import com.cmg.design.pattern.structural.proxy.Order;
import com.cmg.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/1 21:51
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        IOrderService dynaminOrderService = (IOrderService)new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        dynaminOrderService.saveOrder(order);
    }
}
