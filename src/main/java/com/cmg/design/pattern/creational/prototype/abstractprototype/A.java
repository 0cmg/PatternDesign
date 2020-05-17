package com.cmg.design.pattern.creational.prototype.abstractprototype;

/**
 * @ClassName A
 * @Author cmg
 * @Date 2020/5/17 16:36
 * @Description TODO
 **/
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
