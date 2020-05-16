package com.cmg.design.pattern.creational.singleton;

/**
 * @ClassName EnumInstance
 * @Author cmg
 * @Date 2020/5/16 21:46
 * @Description TODO
 **/
public enum EnumInstance {
    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("Cmg Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
