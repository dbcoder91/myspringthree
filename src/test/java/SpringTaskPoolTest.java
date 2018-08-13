import com.dbcoder.thread.MyRunnable;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class SpringTaskPoolTest extends BaseJunit4Test {
    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor2;

    @Test
    public void name() {
        taskExecutor.execute(new MyRunnable());
    }
}
