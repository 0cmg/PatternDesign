package com.cmg.design.pattern.structural.adapter.objectadapter;

/**
 * @ClassName PowerDC5
 * @Author cmg
 * @Date 2020/5/30 10:17
 * @Description TODO
 **/
public class PowerAdapterDC5 implements DC5 {
    private AC220 ac220 = new AC220();
    public int outputDC5() {
        int inputPower = ac220.outputAC220V();
        //变压器
        int outputPower = inputPower/44;
        System.out.println("使用PowerAdapterDC5，输入AC："+inputPower+"V,"+"输出DC:"+outputPower+"V");
        return outputPower;
    }
}
