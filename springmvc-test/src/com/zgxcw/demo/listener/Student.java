package com.zgxcw.demo.listener;

/**
 * Created by lsjf on 2016/9/13.
 */
public class Student {
    private String name;
    //声明监听器,监听器一般为接口
    private StudentListener listener;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Study() {
        //如果监听器不为空,则先执行监听器
        if (listener != null) {
            listener.preStudy(new StudentEvent(this));
        }
        System.out.println(name + "开始学习了");
    }

    public void sleep() {
        //如果监听器不为空,则先执行监听器
        if (listener != null) {
            listener.proSleep(new StudentEvent(this));
        }
        System.out.println(name + "开始睡觉了");
    }

    //需要有注册监听器的方法
    public void addStudentListener(StudentListener listener) {
        this.listener = listener;
    }

}
