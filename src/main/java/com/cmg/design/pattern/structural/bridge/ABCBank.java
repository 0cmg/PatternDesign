package com.cmg.design.pattern.structural.bridge;

/**
 * @ClassName ABCBank
 * @Author cmg
 * @Date 2020/5/31 21:02
 * @Description TODO
 **/
public class ABCBank extends AbstractBank{
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
