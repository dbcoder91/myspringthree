package com.dbcoder.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.UUID;

@Aspect
@Component
public class SystemLogAspect {
    HttpServletRequest request=null;

    Logger logger= Logger.getLogger(this.getClass());

    ThreadLocal<Long> time = new ThreadLocal<Long>();
    //用于生成操作日志的唯一标识，用于业务流程审计日志调用
    public static ThreadLocal<String> tag = new ThreadLocal<String>();

    @Pointcut("@annotation(com.dbcoder.aop.annotation.SystemControllerLog)")
    public void log(){
        System.out.println("This is a Pointcut");
    }

    @Before("log()")
    public void beforeExec(JoinPoint joinPoint){
        time.set(System.currentTimeMillis());
        info(joinPoint);
        tag.set(UUID.randomUUID().toString());
        request=((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

    }

    @After("log()")
    public void afterExec(JoinPoint joinPoint){
        MethodSignature ms=(MethodSignature) joinPoint.getSignature();
        Method method=ms.getMethod();
        logger.debug("标记为" + tag.get() + "的方法" + method.getName()
                + "运行消耗" + (System.currentTimeMillis() - time.get()) + "ms");
    }

    private void info(JoinPoint joinPoint) {
        logger.debug("--------------------------------------------------");
        logger.debug("King:\t" + joinPoint.getKind());
        logger.debug("Target:\t" + joinPoint.getTarget().toString());
        Object[] os = joinPoint.getArgs();
        logger.debug("Args:");
        for (int i = 0; i < os.length; i++) {
            logger.debug("\t==>参数[" + i + "]:\t" + os[i].toString());
        }
        logger.debug("Signature:\t" + joinPoint.getSignature());
        logger.debug("SourceLocation:\t" + joinPoint.getSourceLocation());
        logger.debug("StaticPart:\t" + joinPoint.getStaticPart());
        logger.debug("--------------------------------------------------");
    }
}
