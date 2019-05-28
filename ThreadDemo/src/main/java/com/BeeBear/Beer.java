package com.BeeBear;

public class Beer extends  Thread{
    private int beerCode ;
    private BeePool beePool;
    public Beer(int beerCode, BeePool beePool) {
        this.beerCode = beerCode;
        this.beePool = beePool;
    }

    @Override
    public void run() {
        while(true){
            beePool.removeBee();
        }
    }
}
