package com.zgxcw.demo.listener;

/**
 * Created by lsjf on 2016/9/13.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("狗蛋");
        //注册监听器
        s.addStudentListener(new MySudentListener());
        s.Study();
        s.sleep();
    }
}
