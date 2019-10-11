package com.cn;

import sun.util.locale.provider.TimeZoneNameUtility;

import java.sql.Time;
import java.util.concurrent.*;

public class TestExecutor {
    public  void test() {
        //newFixedThreadExecutor 采用无界队列 LinkedBlockingQueue
        ThreadPoolExecutor newFixedThreadExecutor = new
                ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        ThreadPoolExecutor newSingleThreadPool = new
                ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        ThreadPoolExecutor newCachedThreadPool = new
                ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<>());
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        // newFixedThreadExecutor int max    max, max. 0, TimeUtil, LinkedBlockingQueue()
        // newSingleThreadPool  1, 1, 0, TimeUtil, LinkedBlockingQueue()
        // newCachedThreadExecutor 0, Integer.MAXVALUE, SynchronousBlockingQueue()
        // newScheduledThreadPoolExecutor 1

    }
}
