package com.cmg.design.pattern.behavioral.interpreter;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/6/6 15:54
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        String cmgInputStr = "6 100 11 + *";
        CmgExpressionParse cmgExpressionParse = new CmgExpressionParse();
        int result = cmgExpressionParse.parse(cmgInputStr);
        System.out.println("解释器计算结果：" + result);
    }
}
