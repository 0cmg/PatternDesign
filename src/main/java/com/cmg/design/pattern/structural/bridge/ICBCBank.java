package com.cmg.design.pattern.structural.bridge;

/**
 * @ClassName ICBCBank
 * @Author cmg
 * @Date 2020/5/31 21:02
 * @Description TODO
 **/
public class ICBCBank extends AbstractBank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
