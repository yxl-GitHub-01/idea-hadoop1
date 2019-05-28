package com.BeeBear;

public class BeePool {
    //产蜜个数
    private int makeBeeNum = 0;
    //产蜜
    public synchronized void makeBee(){
        while(makeBeeNum >= 100){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        makeBeeNum ++;
        if (makeBeeNum>=20){
            System.out.println("-------------------------------------------------------------");
            notifyAll();
        }
    }

    //熊吃蜜，满20才会吃
    public synchronized void removeBee(){
        while (makeBeeNum < 20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        makeBeeNum = makeBeeNum -20;
        if (makeBeeNum<20){
            notifyAll();
        }
        System.out.println("-----------chimi:"+makeBeeNum);
    }

}
