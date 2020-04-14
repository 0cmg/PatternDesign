package com.cmg.design.principle.openclose;

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(int id, String name, double price) {
        super(id, name, price);
    }

    public double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.8;
    }
}
