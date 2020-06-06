package com.cmg.design.pattern.behavioral.command;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName OpenCourseVideoCommand
 * @Author cmg
 * @Date 2020/6/6 17:50
 * @Description TODO
 **/
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
