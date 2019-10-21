package com.vn.hello;

import java.util.ArrayList;

public class MyService {

    private ArrayList<Integer> list = new ArrayList<>();

    public synchronized void produce(){

        try {
            while (!list.isEmpty()){
                System.out.println("生产者"+Thread.currentThread().getName()+"waiting");
                this.wait();
            }
            list.add(1);
            System.out.println("生产者"+Thread.currentThread().getName()+"制造");
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consumer(){

        try {
            while (list.isEmpty()){
                System.out.println("消费者"+Thread.currentThread().getName()+"等待生产");
                this.wait();
            }
            list.clear();
            System.out.println("消费者"+Thread.currentThread().getName()+"消费了");
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread{

    private MyService myService;

    public Consumer(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
            while (true){
                myService.consumer();
            }
    }
}

class Produce extends Thread{

    private MyService myService;

    public Produce(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        while (true){
            myService.produce();
        }
    }
}


class Main{
    public static void main(String[] args) {

        MyService myService = new MyService();

        Produce produce = new Produce(myService);
        Consumer consumer = new Consumer(myService);


        produce.start();
        consumer.start();
    }
}
