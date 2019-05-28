package com.thredTest;

public class SallerApp {

    public static void main(String[] args) {
        TicketPool pool = new TicketPool();
        ThredDemo s1 = new ThredDemo("zhangsan",pool);
        ThredDemo s2 = new ThredDemo("lisi",pool);
        s1.start();
        s2.start();
    }
}
