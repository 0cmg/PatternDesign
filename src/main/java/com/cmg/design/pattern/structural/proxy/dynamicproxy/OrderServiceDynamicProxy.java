package com.cmg.design.pattern.structural.proxy.dynamicproxy;

import com.cmg.design.pattern.structural.proxy.Order;
import com.cmg.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName OrderServiceDynamicProxy
 * @Author cmg
 * @Date 2020/6/1 21:40
 * @Description TODO
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object){
        int userId = 0;
        System.out.println("动态代理 before 方法");
        if(object instanceof Order){
            Order order = (Order)object;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到DB【"+dbRouter+"】处理数据");
        //设置DataSource
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }
    private void afterMethod(){
        System.out.println("动态代理 After 方法");
    }
}
