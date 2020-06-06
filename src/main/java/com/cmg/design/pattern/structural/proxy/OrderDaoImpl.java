package com.cmg.design.pattern.structural.proxy;

/**
 * @ClassName OrderDaoImpl
 * @Author cmg
 * @Date 2020/6/1 21:14
 * @Description TODO
 **/
public class OrderDaoImpl implements IOrderDao {
    public int insertOrder(Order order) {
        System.out.println("Order 新增成功");
        return 1;
    }
}
