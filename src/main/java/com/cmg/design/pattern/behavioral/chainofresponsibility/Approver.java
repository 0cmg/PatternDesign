package com.cmg.design.pattern.behavioral.chainofresponsibility;

/**
 * @ClassName Approver
 * @Author cmg
 * @Date 2020/6/6 20:46
 * @Description TODO
 **/
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
