package com.thredTest.producemer.thredTest;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        TicketPool pool = new TicketPool();
        Producemer p1 = new Producemer("tom",pool);
        Producemer p2 = new Producemer("jarry",pool);
        Consumer c = new Consumer("mali",pool);
        p1.start();
        p2.start();
        c.start();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
    }
}
