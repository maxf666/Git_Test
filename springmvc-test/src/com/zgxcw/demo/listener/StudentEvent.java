package com.zgxcw.demo.listener;

/**
 * Created by lsjf on 2016/9/13.
 */
public class StudentEvent {
    private Object source;
    public StudentEvent(Object source){
        this.source=source;
    }
    public Object getSource() {
        return source;
    }

}
