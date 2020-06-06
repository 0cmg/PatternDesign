package com.cmg.design.pattern.behavioral.state;

/**
 * @ClassName PlayState
 * @Author cmg
 * @Date 2020/6/6 21:10
 * @Description TODO
 **/
public class StopState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.err.println("Error 停止状态不能快进！");
    }

    @Override
    public void pause() {
        System.err.println("Error 停止状态不能暂停！");
    }

    @Override
    public void stop() {
        System.out.println("停止播放课程视频状态");
    }
}
