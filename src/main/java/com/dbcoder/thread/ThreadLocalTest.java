package com.dbcoder.thread;
/**
* @Description:测试本地线程变量
 * 1.定义了两个ThreadLocal变量。终于的目的就是要看最后两个值能否相应上。
 * 2.这样才有机会证明ThreadLocal所保存的数据可能是线程私有的
 * 3.能够看到输出的线程顺序并不是最初定义线程的顺序，理论上能够说明多线程应当是并发运行的，
 *   可是依旧能够保持每一个线程里面的值是相应的，说明这些值已经达到了线程私有的目的
 *
* @author: bo.dong
* @Date: 2018-08-09 13:52:25
*/
public class ThreadLocalTest {
  static class ThreadLocalClass{
      private static ThreadLocal<String> threadLocal1=new ThreadLocal<>();
      private static ThreadLocal<String> threadLocal2=new ThreadLocal<>();
  }

   static class A{
        public void setOne(String value){
            ThreadLocalClass.threadLocal1.set(value);
        }

        public void setTwo(String value){
            ThreadLocalClass.threadLocal2.set(value);
        }
   }

   static class B{
      public void display(){
          System.out.println(ThreadLocalClass.threadLocal1.get()+":"+ThreadLocalClass.threadLocal2.get());
      }
   }

    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        for (int i=0;i<15;i++){
            String str1="线程-"+i;
            String str2=" value=("+i+")";
            new Thread(){
                @Override
                public void run() {
                    try{
                        a.setOne(str1);
                        a.setTwo(str2);
                        b.display();
                    }finally {
                        ThreadLocalClass.threadLocal1.remove();
                        ThreadLocalClass.threadLocal2.remove();
                    }
                }
            }.start();
        }
    }
}
