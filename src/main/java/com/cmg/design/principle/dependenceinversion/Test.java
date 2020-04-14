package com.cmg.design.principle.dependenceinversion;

public class Test {

    //V1.0
//    public static void main(String[] args) {
//        Cmg cmg = new Cmg();
//        cmg.studyJavaCourse();
//        cmg.studyFECourse();
//        cmg.studyPythonCourse();
//    }
    //V2.0
//    public static void main(String[] args) {
//        Cmg cmg = new Cmg();
//        cmg.studyCourse(new JavaCourse());
//        cmg.studyCourse(new FECourse());
//        cmg.studyCourse(new PythonCourse());
//    }
    //V3.0
//    public static void main(String[] args) {
//        Cmg java = new Cmg(new JavaCourse());
//        java.studyCourse();
//
//        Cmg fe = new Cmg(new FECourse());
//        fe.studyCourse();
//
//        Cmg python = new Cmg(new PythonCourse());
//        python.studyCourse();
//    }
    //V4.0
    public static void main(String[] args) {
        Cmg cmg = new Cmg();
        cmg.setiCourse(new JavaCourse());
        cmg.studyCourse();

        cmg.setiCourse(new FECourse());
        cmg.studyCourse();

        cmg.setiCourse(new PythonCourse());
        cmg.studyCourse();
    }

}
