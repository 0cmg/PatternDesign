package com.cmg.design.pattern.behavioral.command;


/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/6 17:54
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲");
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommad(openCourseVideoCommand);
        staff.addCommad(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
