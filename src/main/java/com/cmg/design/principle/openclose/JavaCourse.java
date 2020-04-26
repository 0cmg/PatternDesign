package com.cmg.design.principle.openclose;

public class JavaCourse implements ICourse {

    private int id;
    private String name;
    private double price;

    public JavaCourse(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

}
