package com.cmg.design.pattern.creational.prototype;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/17 16:28
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模本");
        System.out.println(mail.toString());
        for(int i=0; i<10; i++){
            Mail tempMail = (Mail) mail.clone();
            tempMail.setName("姓名"+i);
            tempMail.setEmailAddress("姓名"+i+"@mooc.com");
            tempMail.setContent("恭喜您中奖了！");
            MailUtil.sendMail(tempMail);
            System.out.println(tempMail.toString());
        }
        MailUtil.saveOriginMainRecord(mail);
    }
}
