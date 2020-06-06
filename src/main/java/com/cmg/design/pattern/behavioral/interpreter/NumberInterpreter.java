package com.cmg.design.pattern.behavioral.interpreter;

/**
 * @ClassName NumberInterpreter
 * @Author cmg
 * @Date 2020/6/6 15:51
 * @Description TODO
 **/
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }
    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpreter() {
        return this.number;
    }
}
