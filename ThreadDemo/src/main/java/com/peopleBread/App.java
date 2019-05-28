package com.peopleBread;


public class App {
    public static void main(String[] args) {
        Pool pool = new Pool();
        for(int i = 1;i<=30;i++){
            People peoplei = new People(i,pool);
            peoplei.start();
        }
    }
}
