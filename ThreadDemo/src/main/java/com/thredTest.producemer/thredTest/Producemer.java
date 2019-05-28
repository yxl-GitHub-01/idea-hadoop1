package com.thredTest.producemer.thredTest;

public class Producemer extends Thread{
    private String name;
    private TicketPool pool;
    private static int index = 0;
    public Producemer(String name, TicketPool pool){
        super();
        this.name = name;
        this.pool =  pool;
    }
    @Override
    public void run() {
        while (true){
           int n =  pool.addNum(index++);
            System.out.println("退票------------------name:"+name+",ticket:"+n);
    }

    }

}
