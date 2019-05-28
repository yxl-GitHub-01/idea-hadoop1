package com.invocationDemo;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestProxy {
    @Test
    public void testProxy(){
        PrintService printService = new PrintServiceImpl();
        MyInvocationHandler h = new MyInvocationHandler(printService);

        PrintService ip = (PrintService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{PrintService.class},h);
        ip.test1("张三");
        ip.test2("lisi",23);
    }
}
