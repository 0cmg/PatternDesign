package com.cmg.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @ClassName VideoApprover
 * @Author cmg
 * @Date 2020/6/6 20:53
 * @Description TODO
 **/
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotBlank(course.getVideo())){
            System.out.println(course.getName()+"含有视频，批准");
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含有视频，不批准，流程结束");
        }
    }
}
