package com.leammin.jvm;

public class TestObject {
    private String test;

    public TestObject(String test) {
        this.test = test;
    }

    public TestObject() {
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
        System.out.println(inc());
    }

    public static int inc() {
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
            System.out.println("t"+x);
        }
    }
}
