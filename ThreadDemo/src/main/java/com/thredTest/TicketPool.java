package com.thredTest;

public class TicketPool {
    private int ticketNum = 100;


    public synchronized int getTicketNum(){
        if(ticketNum == 0){
            return 0;
        }
        int tmp = ticketNum;
        ticketNum--;
        return tmp;
    }
}
