package com.cmg.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author cmg
 * @Date 2020/6/6 21:10
 * @Description TODO
 **/
public class PauseState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放课程视频状态");
    }

    @Override
    public void stop() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
