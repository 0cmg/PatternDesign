package com.cmg.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName ArticleApprover
 * @Author cmg
 * @Date 2020/6/6 20:48
 * @Description TODO
 **/
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotBlank(course.getArticle())){
            System.out.println(course.getName()+"含有手记，批准");
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含有手记，不批准，流程结束");
        }
    }
}
