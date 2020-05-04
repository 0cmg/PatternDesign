package com.cmg.design.pattern.creational.simplefactory;

/**
 * @ClassName VideoFactory
 * @Author cmg
 * @Date 2020/5/4 15:06
 * @Description TODO
 **/
public class VideoFactory {
    public Video getInstance(Class c)  {
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
    public Video getInstance(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }
}
