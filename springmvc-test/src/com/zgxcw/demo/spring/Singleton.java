package com.zgxcw.demo.spring;

/**
 * Created by lsjf on 2016/9/13.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    //代码能进入的这个地方的概率非常小，这样写是最好的，获取实例的时候就不用每次都同步了，可以提高性能
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
