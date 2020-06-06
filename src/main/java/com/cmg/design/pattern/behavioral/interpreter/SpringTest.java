package com.cmg.design.pattern.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @ClassName SpringTest
 * @Author cmg
 * @Date 2020/6/6 16:20
 * @Description TODO
 **/
public class SpringTest {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100 * 2 + 400 * 1 + 600");
        int result = (Integer)expression.getValue();
        System.out.println(result);
    }
}
