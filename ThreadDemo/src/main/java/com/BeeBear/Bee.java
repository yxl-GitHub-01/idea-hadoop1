package com.BeeBear;

public class Bee extends  Thread{
    public int beeCode ;
    public BeePool beePool;
    public Bee(int beeCode,BeePool beePool) {
        this.beeCode = beeCode;
        this.beePool = beePool;
    }

    @Override
    public void run() {
        while(true){
            beePool.makeBee();
            System.out.println("----------------------beeCode:"+beeCode+"，产蜜");
        }
    }
}
