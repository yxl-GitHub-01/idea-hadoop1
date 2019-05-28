package com.peopleBread;

public class People extends Thread{
    private int peopleCode;
    private Pool pool;
    public People(int peopleCode,Pool pool) {
        this.peopleCode=peopleCode;
        this.pool = pool;
    }

    @Override
    public void run() {
        while (pool.eatBread(peopleCode)==1){
        }

        System.out.println("=====================================和尚吃饱了！"+peopleCode);}
}
