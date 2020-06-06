package com.cmg.design.pattern.behavioral.interpreter;

/**
 * @ClassName AddInterpreter
 * @Author cmg
 * @Date 2020/6/6 15:49
 * @Description TODO
 **/
public class AddInterpreter implements Interpreter {
    private Interpreter firstInterpreter,secondInterpreter;

    public AddInterpreter(Interpreter firstInterpreter, Interpreter secondInterpreter) {
        this.firstInterpreter = firstInterpreter;
        this.secondInterpreter = secondInterpreter;
    }

    @Override
    public int interpreter() {
        return this.firstInterpreter.interpreter() + secondInterpreter.interpreter();
    }

    @Override
    public String toString() {
        return " + ";
    }
}
