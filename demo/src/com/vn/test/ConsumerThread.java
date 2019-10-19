package com.vn.test;

public class ConsumerThread extends Thread{

    private Consumer consumer;

    public ConsumerThread(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true){
            consumer.consumer();
        }
    }
}
