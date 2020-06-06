package com.cmg.design.pattern.behavioral.state;

/**
 * @ClassName CourseVideoState
 * @Author cmg
 * @Date 2020/6/6 21:07
 * @Description TODO
 **/
public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContent;

    public void setCourseVideoContent(CourseVideoContext courseVideoContent) {
        this.courseVideoContent = courseVideoContent;
    }
    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
