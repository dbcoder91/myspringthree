import com.dbcoder.aop.annotation.CacheRedis;
import org.junit.Test;

public class AspectjTest extends BaseJunit4Test {
    @Test
    @CacheRedis(key = "test",expireTime = 20)
    public void name() {
        System.out.println("进入Junit4测试");
    }
}
