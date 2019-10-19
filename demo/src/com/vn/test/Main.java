package com.vn.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        ArrayList<Integer> list = new ArrayList<>();

        Consumer consumer = new Consumer(object, list);
        Produce produce = new Produce(object, list);

        ProduceThread produceThread = new ProduceThread(produce);
        ConsumerThread consumerThread = new ConsumerThread(consumer);
        consumerThread.start();
        produceThread.start();

    }
}
