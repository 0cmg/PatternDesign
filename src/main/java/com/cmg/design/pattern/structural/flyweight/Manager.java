package com.cmg.design.pattern.structural.flyweight;

/**
 * @ClassName Manager
 * @Author cmg
 * @Date 2020/5/30 13:33
 * @Description TODO
 **/
public class Manager implements Employee {
    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void report() {
        System.out.println(reportContent);
    }
}
