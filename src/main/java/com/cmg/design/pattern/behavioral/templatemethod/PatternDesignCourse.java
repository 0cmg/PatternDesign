package com.cmg.design.pattern.behavioral.templatemethod;

/**
 * @ClassName PatternDesignCourse
 * @Author cmg
 * @Date 2020/6/2 21:45
 * @Description TODO
 **/
public class PatternDesignCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程的Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
