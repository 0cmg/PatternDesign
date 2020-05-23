package com.cmg.design.pattern.structural.facade;

/**
 * @ClassName QualifyService
 * @Author cmg
 * @Date 2020/5/23 16:19
 * @Description TODO
 **/
public class QualifyService {
    public boolean isValiable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+"积分资格通过！");
        return true;
    }
}
