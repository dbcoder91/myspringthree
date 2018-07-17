package com.dbcoder.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
* @Description: 测试java中创建的线程创建三种基本形式
* @author 董博
* @date 2018/7/17
*/
public class ThreadTest {
    public static void main(String[] args) {
        //region 继承Thread类
        /*for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==30){
                Thread myThread1=new MyThread();
                Thread myThread2=new MyThread();
                myThread1.start();
                myThread2.start();
            }
        }*/
        //endregion

        //region 实现Runnable接口
        /*for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==30){
                //创建一个Runnable实现类的对象
                Runnable myRunnable=new MyRunnable();
                //将myRunnable作为Thread target创建的新的线程
                Thread thread1=new Thread(myRunnable);
                Thread thread2=new Thread(myRunnable);
                //调用start()方法使得线程进入就绪状态
                thread1.start();
                thread2.start();
            }
        }*/
        //endregion

        //region 使用Callable接口和Future接口创建线程
        /*//创建MyCallable对象
        Callable<Integer> myCallable=new MyCallable();
        //使用FutureTask来包装MyCallable对象
        FutureTask<Integer> ft=new FutureTask<Integer>(myCallable);
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==30){
                //FutureTask对象作为Thread对象的target创建新的线程
                Thread thread=new Thread(ft);
                //线程进入到就绪状态
                thread.start();
            }
        }
        System.out.println("主线程for循环执行完毕..");
        try{
            //取得新创建的新线程中的call()方法返回的结果
            int sum=ft.get();
            //ft.get()方法获取子线程call()方法的返回值时，子线程没有执行完，ft.get()会一直阻塞，直到call()方法执行完毕才能取到返回值
            System.out.println("sum= "+sum);
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }*/
        //endregion

        //region 终止某一线程的运行
        MyRunnable myRunnable=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i==30){
                thread.start();
            }

            if(i==40){
                myRunnable.stopThread();
            }
        }
        //endregion
    }
}
