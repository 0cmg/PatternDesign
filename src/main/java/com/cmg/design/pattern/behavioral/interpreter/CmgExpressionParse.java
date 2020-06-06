package com.cmg.design.pattern.behavioral.interpreter;


import java.util.Stack;

/**
 * @ClassName CmgExpressionParse
 * @Author cmg
 * @Date 2020/6/6 15:55
 * @Description TODO
 **/
public class CmgExpressionParse {
    private Stack<Interpreter> stack = new Stack<Interpreter>();
    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for(String symbol : strItemArray){
            if(!OperatorUtil.isOperator(symbol)){
                Interpreter numberInterpreter = new NumberInterpreter(symbol);
                stack.push(numberInterpreter);
                System.out.println(String.format("入栈：%d",numberInterpreter.interpreter()));
            }else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d", firstExpression.interpreter(), secondExpression.interpreter()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符：%s", operator));
                int result = operator.interpreter();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%d", resultExpression.interpreter()));
            }
        }
        int result = stack.pop().interpreter();
        return result;
    }
}
