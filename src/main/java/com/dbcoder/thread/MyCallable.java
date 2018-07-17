package com.dbcoder.thread;

import java.util.concurrent.Callable;

/**
* @Description: 使用Callable和Future接口创建线程
* @author 董博
* @date 2018/7/17
*/
public class MyCallable implements Callable<Integer> {
    private int i=0;

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            sum+=i;
        }
        return sum;
    }
}
