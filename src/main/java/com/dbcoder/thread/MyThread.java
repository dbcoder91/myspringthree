package com.dbcoder.thread;

/**
* @Description: 继承Thread类，重写该类的run()方法
* @author 董博
* @date 2018/7/17
*/
public class MyThread extends Thread {
    private int i=0;

    @Override
    public void run() {
        for (i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
