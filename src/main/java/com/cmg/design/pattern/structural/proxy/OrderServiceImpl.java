package com.cmg.design.pattern.structural.proxy;

/**
 * @ClassName OrderServiceImpl
 * @Author cmg
 * @Date 2020/6/1 21:15
 * @Description TODO
 **/
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao;
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service调用Dao层方法添加Order");
        return iOrderDao.insertOrder(order);
    }
}
