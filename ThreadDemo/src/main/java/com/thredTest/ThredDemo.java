package com.thredTest;

public class ThredDemo extends Thread{
    private String name;
    private  TicketPool pool;
    public ThredDemo(String name, TicketPool pool){
        super();
        this.name = name;
        this.pool =  pool;
    }
    @Override
    public void run() {
        while (true){
            int ticket = pool.getTicketNum();
            if(ticket == 0){
                return;
            }
            System.out.println("name:"+name+",ticket:"+ticket);
    }

    }

}
