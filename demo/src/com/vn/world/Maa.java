package com.vn.world;






import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Maa {
    public static void main(String[] args) {
        MyService myservice = new MyService();
        Consumer consumer = new Consumer(myservice);
        Produce produce = new Produce(myservice);

        consumer.start();
        produce.start();
    }
}

class MyService{

    private ReentrantLock lock =  new ReentrantLock();
    private Condition condition = lock.newCondition();
    boolean flag = false;

    public void consumer(){

        lock.lock();

        try {
            while (!flag){
                System.out.println("消费者"+Thread.currentThread().getName()+"waiting");
                condition.await();
            }
            System.out.println("消费者消费了"+Thread.currentThread().getName()+"消费");
            flag = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void produce(){

        lock.lock();

        try {
            while (flag){
                System.out.println("生产者"+Thread.currentThread().getName()+"等待消费");
                condition.await();
            }
            System.out.println("生产者"+Thread.currentThread().getName()+"生产了");
            flag = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
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

