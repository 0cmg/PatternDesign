package com.cmg.design.pattern.structural.flyweight;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EmployeeFactory
 * @Author cmg
 * @Date 2020/5/30 13:38
 * @Description TODO
 **/
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    public static Employee getManager(String department){
        Manager manager = (Manager)EMPLOYEE_MAP.get(department);
        if(manager == null){
            manager = new Manager(department);
            System.out.print("创建部门经理："+department);
            String reportContent = department+"此次报告的内容是：......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告："+reportContent);

            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;
    }
}
