package com.cmg.design.pattern.structural.proxy.staticproxy;

import com.cmg.design.pattern.structural.proxy.IOrderService;
import com.cmg.design.pattern.structural.proxy.Order;
import com.cmg.design.pattern.structural.proxy.OrderServiceImpl;
import com.cmg.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @ClassName OrderServiceStaticProxy
 * @Author cmg
 * @Date 2020/6/1 21:18
 * @Description TODO
 **/
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;
    public int saeOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }
    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到DB【"+dbRouter+"】处理数据");
        //设置DataSource
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
        System.out.println("静态代理 Before 方法");
    }
    private void afterMethod(){
        System.out.println("静态代理 After 方法");
    }
}
