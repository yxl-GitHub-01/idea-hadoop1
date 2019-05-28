package com.peopleBread;

import java.util.*;

public class Pool {
    private int breadNum = 100;
    Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    public synchronized int eatBread(int peopleCode){
            if(map.size()<30){
                if(!map.containsKey(peopleCode)){
                    map.put(peopleCode,1);
                    breadNum--;
                    return  1;
                }else{
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else{
                System.out.println("======================================mapsize："+map.size());
                notify();
            }
        if(breadNum <1){
            /* System.out.println("馒头不够了！" + peopleCode);*/
            return 0;
        }
            if(!map.isEmpty()&&map.containsKey(peopleCode)){
                for (Map.Entry<Integer,Integer> map2 : map.entrySet()){
                    if(map2.getKey() == peopleCode){
                        int eatBreakNum = map2.getValue();
                        System.out.println("-----eatBreakNum："+eatBreakNum);
                        if(eatBreakNum>=5){
                            System.out.println("-----和尚："+peopleCode+",已经吃了5个了！");
                            return -1;
                        }else{
                            int addBreakNum = eatBreakNum+1 ;
                            map.put(peopleCode,addBreakNum);
                            breadNum--;
                            break;
                        }
                    }
                }
            }else{
                map.put(peopleCode,1);
            }
        return 1;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(1);
        for(Integer set1 : set){
           /* System.out.println("key:"+set1);*/
        }



    }
}
