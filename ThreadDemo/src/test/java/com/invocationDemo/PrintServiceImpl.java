package com.invocationDemo;

public class PrintServiceImpl implements  PrintService{
    public void test1(String name) {
        System.out.println("test1----name:"+name);
    }

    public void test2(String name, int age) {
        System.out.println("test21----name:"+name+",age:"+age);
    }
}
