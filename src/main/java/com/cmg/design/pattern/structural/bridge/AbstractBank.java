package com.cmg.design.pattern.structural.bridge;

/**
 * @ClassName AbstractBank
 * @Author cmg
 * @Date 2020/5/31 21:00
 * @Description TODO
 **/
public abstract class AbstractBank {
    protected Account account;

    public AbstractBank(Account account) {
        this.account = account;
    }
    abstract Account openAccount();
}
