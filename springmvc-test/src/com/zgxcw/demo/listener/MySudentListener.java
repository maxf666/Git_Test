package com.zgxcw.demo.listener;

/**
 * Created by lsjf on 2016/9/13.
 */
public class MySudentListener implements StudentListener {
    @Override
    public void preStudy(StudentEvent e) {
        Student s = (Student) e.getSource();
        System.out.println(s.getName() + "喝杯牛奶吧");
    }

    @Override
    public void proSleep(StudentEvent e) {
        Student s = (Student) e.getSource();
        System.out.println(s.getName() + "听歌故事吧");
    }
}
