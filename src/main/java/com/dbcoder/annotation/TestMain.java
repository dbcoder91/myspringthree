package com.dbcoder.annotation;

import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
//无法使用，应为main没有加载applicationContext上下文，
// 如果使用 ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext();
// 配合使用 applicationContext.getBean()，获取bean

        TestB testB = new TestB();
        testB.TestMethod();
    }
}
