package com.java.oops.exception.handling;

public class Parent {

    private String name;
    private int age;

    public Parent(String name , int age) {
        this.name = name;
        this.age = age;
    }

    public void test1() throws Exception {
        System.out.println("Parent test 1");
    }

    public void test2() throws Exception {
        System.out.println("Parent test 2");
    }

    public void test3() {
        System.out.println("Parent test 3");
    }
}
