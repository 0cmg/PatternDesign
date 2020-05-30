package com.cmg.design.pattern.structural.composite;

/**
 * @ClassName Course
 * @Author cmg
 * @Date 2020/5/30 14:35
 * @Description TODO
 **/
public class Course extends CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name："+this.name+" Price："+this.price);
    }
}
