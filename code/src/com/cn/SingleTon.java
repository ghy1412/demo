package com.cn;

public class SingleTon {
    private static volatile SingleTon singleTon;
    private SingleTon(){} //构造方法私有

    public static SingleTon getInstance() {
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
