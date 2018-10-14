import com.dbcoder.thread.MyRunnable;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SpringTaskPoolTest extends BaseJunit4Test {
    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor2;

    @Test
    public void name() {


        //taskExecutor.execute(new MyRunnable());
        Callable<Integer> myCallable=new Callable<Integer>(){

            @Override
            public Integer call() throws Exception {
                Thread.sleep(5000);
                return 1;
            }
        };
        FutureTask<Integer> futureTask=new FutureTask<Integer>(myCallable);
        taskExecutor.execute(futureTask);

        Integer a=0;
        try {
            System.out.println(new Date());
            a=futureTask.get();
            System.out.println(new Date());
            System.out.println("结果："+a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testA(){
        System.out.println("test aspectj");
    }
}
