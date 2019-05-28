package com.thredTest.producemer.thredTest;

public class Consumer extends Thread{
    private String name;
    private TicketPool pool;
    public Consumer(String name, TicketPool pool){
        super();
        this.name = name;
        this.pool =  pool;
    }
    @Override
    public void run() {
        while (true){
            try {
               int ticket =  pool.removeNum();
                System.out.println("买票----------------------name:"+name+",ticket:"+ticket);
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    }

}
