package com.cmg.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author cmg
 * @Date 2020/6/6 21:10
 * @Description TODO
 **/
public class PlayState  extends CourseVideoState{
    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
    }

    @Override
    public void speed() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
