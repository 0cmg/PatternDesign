package com.cmg.design.pattern.behavioral.chainofresponsibility;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/6 20:54
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式");
        course.setArticle("手记");
        course.setVideo("视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
