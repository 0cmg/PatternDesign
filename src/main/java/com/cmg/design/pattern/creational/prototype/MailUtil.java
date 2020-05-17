package com.cmg.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @ClassName MailUtil
 * @Author cmg
 * @Date 2020/5/17 16:08
 * @Description TODO
 **/
public class MailUtil {
    public static void sendMail(Mail mail){
        String outPutMessage = "向{0}同学，邮件地址：{1},邮件内容：{2}，发送邮件成功！";
        System.out.println(MessageFormat.format(outPutMessage, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMainRecord(Mail mail){
        System.out.println("保存origin mail record:"+mail.getContent());
    }
}
