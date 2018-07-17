package com.dbcoder.thread;

/**
 * @author 董博
 * @Description: 实现Runnable接口，重写该接口的run()方法
 * @date 2018/7/17
 */
public class MyRunnable implements Runnable {
    private boolean stop;

    private int i = 0;

    @Override
    public void run() {
        //region 对应ThreadTest类： 实现Runnable接口
        /*for(i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }*/
        //endregion

        //region 终止某一线程的运行
        for (; i < 100 && !stop; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        //endregion
    }

    /**
    * @Description: 对应ThreadTest类： 终止某一线程的运行
    * @author 董博
    * @date 2018/7/17
    */
    public void stopThread() {
        this.stop = true;
    }
}
