package com.dbcoder.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAdvice {
    private Logger logger= Logger.getLogger(this.getClass());


}
