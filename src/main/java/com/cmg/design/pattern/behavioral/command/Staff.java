package com.cmg.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Staff
 * @Author cmg
 * @Date 2020/6/6 17:52
 * @Description TODO
 **/
public class Staff {
    private List<Command> commandList = new ArrayList<Command>();

    public void addCommad(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
}
