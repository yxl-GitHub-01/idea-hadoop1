package com.BeeBear;

public class App {
    public static void main(String[] args) {
        BeePool beepool = new BeePool();
        //100 只蜂蜜产蜜
        for(int i = 0 ;i <= 100;i++){
            Bee beei = new Bee(i,beepool);
            beei.start();
        }
        //2只熊吃米
        Beer beer1 = new Beer(1,beepool);
        Beer beer2 = new Beer(2,beepool);
        beer1.start();
        beer2.start();
    }



}
