package com.cmg.design.pattern.behavioral.interpreter;

/**
 * @ClassName MultiInterpreter
 * @Author cmg
 * @Date 2020/6/6 15:52
 * @Description TODO
 **/
public class MultiInterpreter implements Interpreter {
    private Interpreter firstInterpreter,secondInterpreter;

    public MultiInterpreter(Interpreter firstInterpreter, Interpreter secondInterpreter) {
        this.firstInterpreter = firstInterpreter;
        this.secondInterpreter = secondInterpreter;
    }
    @Override
    public int interpreter() {
        return firstInterpreter.interpreter() * secondInterpreter.interpreter();
    }

    @Override
    public String toString() {
        return " * ";
    }
}
