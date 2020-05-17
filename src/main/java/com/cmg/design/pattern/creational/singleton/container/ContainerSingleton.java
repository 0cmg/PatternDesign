package com.cmg.design.pattern.creational.singleton.container;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ContainerSingleton
 * @Author cmg
 * @Date 2020/5/17 15:10
 * @Description TODO
 **/
public class ContainerSingleton {
    private ContainerSingleton(){

    }
    private static Map<String, Object> singleMap = new HashMap<String, Object>();
    public static void pushInstance(String key, Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if(!singleMap.containsKey(key)){
                singleMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singleMap.get(key);
    }
}
