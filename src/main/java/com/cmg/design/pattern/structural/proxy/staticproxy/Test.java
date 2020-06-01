package com.cmg.design.pattern.structural.proxy.staticproxy;


import com.cmg.design.pattern.structural.proxy.Order;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/1 21:33
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saeOrder(order);
    }
}
