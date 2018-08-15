package com.dbcoder.aop.aspect;

import com.dbcoder.aop.annotation.CacheRedis;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CacheService {
    Logger logger= LoggerFactory.getLogger(CacheService.class);

    @Pointcut(value = "@annotation(com.dbcoder.aop.annotation.CacheRedis)")
    public void pointCut(){}

    @Before(value = "pointCut() && @annotation(cacheRedis)")
    public void before(CacheRedis cacheRedis){
        logger.info("the result of this method will be cached.");
    }

    @AfterReturning(value = "pointCut() && @annotation(cacheRedis)",returning = "result")
    public void after(CacheRedis cacheRedis,Object result){
        String key=cacheRedis.key();
        int expireTime=cacheRedis.expireTime();
        //do something...
        logger.info("-----redis-----[key = " + key + "]"+"[expireTime = " + expireTime + "]");
        logger.info("the result of this method is" + result + ",and has been cached.");
    }
}
