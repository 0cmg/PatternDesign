package com.cmg.design.pattern.structural.bridge;

import org.aspectj.lang.reflect.DeclareSoft;

/**
 * @ClassName DepositAccount
 * @Author cmg
 * @Date 2020/5/31 20:57
 * @Description TODO
 **/
public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
