package com.vn.test;

import java.util.ArrayList;

public class Consumer {

    public Object object;
    public ArrayList<Integer> list;//用list存放生产之后的数据,最大容量为1

    public Consumer(Object object, ArrayList<Integer> list) {
        this.object = object;
        this.list = list;
    }

    public void consumer(){

        synchronized (object){

            try {
                while (list.isEmpty()){
                    System.out.println("消费者"+Thread.currentThread().getName()+"waiting");
                    object.wait();
                }
                list.clear();
                System.out.println("消费者"+Thread.currentThread().getName()+" Runnable");
                object.notifyAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
