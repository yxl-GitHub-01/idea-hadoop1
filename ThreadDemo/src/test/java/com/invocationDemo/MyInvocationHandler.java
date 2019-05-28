package com.invocationDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object obj ;
    public MyInvocationHandler(Object o){
        this.obj = o;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println( "在每个方法之前增加一段代码！！！！！！"+args[0]);
        return method.invoke(obj,args);
    }
}
