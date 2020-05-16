package com.cmg.design.pattern.creational.singleton.lazy;

/**
 * @ClassName LazyDoubleCheckSingleton
 * @Author cmg
 * @Date 2020/5/16 17:03
 * @Description TODO
 **/
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    //1.分配内存
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton指向刚分配的内存
                    //2和3可会颠倒顺序
                    //intra-thread semantics保证重排序顺序
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
