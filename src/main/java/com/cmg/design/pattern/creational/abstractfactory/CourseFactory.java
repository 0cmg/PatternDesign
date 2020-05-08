package com.cmg.design.pattern.creational.abstractfactory;

/**
 * @ClassName CourseFactory
 * @Author cmg
 * @Date 2020/5/8 20:56
 * @Description TODO
 **/
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
