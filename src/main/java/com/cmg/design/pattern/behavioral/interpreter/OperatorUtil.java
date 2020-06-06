package com.cmg.design.pattern.behavioral.interpreter;

/**
 * @ClassName OperatorUtil
 * @Author cmg
 * @Date 2020/6/6 16:02
 * @Description TODO
 **/
public class OperatorUtil {
    public static boolean isOperator(String symbol){
        return (symbol.equals("+") || symbol.equals("*"));
    }

    public static Interpreter getExpressionObject(Interpreter firstInterpreter, Interpreter secondInterpreter, String symbol){
        if(symbol.equals("+")){
            return new AddInterpreter(firstInterpreter,secondInterpreter);
        }else if(symbol.equals("*")){
            return new MultiInterpreter(firstInterpreter,secondInterpreter);
        }
        return null;
    }
}
