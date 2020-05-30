package com.cmg.design.pattern.structural.flyweight;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/30 13:43
 * @Description TODO
 **/
public class Test {
    private static final String[] DepartMent = {"RD","QC","PM","BD"};
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            String department = DepartMent[(int)(Math.random()*DepartMent.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
