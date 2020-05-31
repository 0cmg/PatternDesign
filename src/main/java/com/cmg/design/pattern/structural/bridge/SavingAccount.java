package com.cmg.design.pattern.structural.bridge;

/**
 * @ClassName SavingAccount
 * @Author cmg
 * @Date 2020/5/31 20:58
 * @Description TODO
 **/
public class SavingAccount implements Account {
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
