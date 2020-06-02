package com.cmg.design.pattern.behavioral.templatemethod;

/**
 * @ClassName FECourse
 * @Author cmg
 * @Date 2020/6/2 21:45
 * @Description TODO
 **/
public class FECourse extends ACourse {
    private boolean needWriteArticle = false;

    public FECourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的课程前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticle;
    }
}
