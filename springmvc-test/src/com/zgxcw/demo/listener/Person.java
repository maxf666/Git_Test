package com.zgxcw.demo.listener;

/**
 * Created by lsjf on 2016/10/8.
 */
public class Person {
    String name;
    int birthYear;
    byte[] raw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public byte[] getRaw() {
        return raw;
    }

    public void setRaw(byte[] raw) {
        this.raw = raw;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
