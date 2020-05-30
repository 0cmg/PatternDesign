package com.cmg.design.pattern.structural.composite;

/**
 * @ClassName Test
 * @Author cmg
 * @Date 2020/5/30 14:41
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);

        CatalogComponent courseCatalogs = new CourseCatalog("课程主目录",1);
        CatalogComponent javaCourseCatlo = new CourseCatalog("Java课程目录",2);

        CatalogComponent course1 = new Course("Java课程一期",13);
        CatalogComponent course2 = new Course("Java课程二期",12);
        CatalogComponent course3 = new Course("Java设计模式",15);

        javaCourseCatlo.add(course1);
        javaCourseCatlo.add(course2);
        javaCourseCatlo.add(course3);

        courseCatalogs.add(linuxCourse);
        courseCatalogs.add(windowsCourse);
        courseCatalogs.add(javaCourseCatlo);

        courseCatalogs.print();

    }
}
