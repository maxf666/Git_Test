package com.zgxcw.demo.spring;

import java.util.concurrent.Exchanger;

/**
 * Created by lsjf on 2016/10/15.
 */
public class ExchangeTest {
    public static void main(String[] args) {
        Exchanger<String> ex=new Exchanger<>();
        new A(ex).start();
        new B(ex).start();
    }
}

class A extends Thread {
    Exchanger<String> ex;

    public A(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        try {
            String exchange;
            exchange = ex.exchange("hello");
            System.out.println("A:" + exchange);
            exchange = ex.exchange("A");
            System.out.println("A:" + exchange);
            exchange = ex.exchange("B");
            System.out.println("A:" + exchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class B extends Thread {
    Exchanger<String> ex;

    public B(Exchanger<String> ex) {
        this.ex = ex;
    }

    @Override
    public void run() {
        try {
            String exchange;
            exchange = ex.exchange("HI");
            System.out.println("b:" + exchange);
            exchange = ex.exchange("1");
            System.out.println("b:" + exchange);
            exchange = ex.exchange("2");
            System.out.println("b:" + exchange);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}