package com.cmg.design.pattern.behavioral.command;

/**
 * @ClassName CloseCourseVideoCommand
 * @Author cmg
 * @Date 2020/6/6 17:50
 * @Description TODO
 **/
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
