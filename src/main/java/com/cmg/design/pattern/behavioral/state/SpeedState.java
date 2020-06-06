package com.cmg.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author cmg
 * @Date 2020/6/6 21:10
 * @Description TODO
 **/
public class SpeedState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放课程视频状态");
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
