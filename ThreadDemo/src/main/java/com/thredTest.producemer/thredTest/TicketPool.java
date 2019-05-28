package com.thredTest.producemer.thredTest;

import java.util.LinkedList;

public class TicketPool {
    private LinkedList<Integer> pool = new LinkedList<Integer>() ;

    public synchronized int addNum(Integer i){
        while(pool.size()>=1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pool.add(i);
        return i;
    }

    public synchronized  int removeNum() throws Exception {
        while(pool.isEmpty()){
            wait();
        }
        notify();
        return pool.removeFirst();
    }
}
