package com.dbcoder.annotation;

import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class TestB {


    private TestA testA;

    public void setTestA(TestA testA) {
        this.testA = testA;
    }

    public void TestMethod(){
        testA.setName("TestA");
        System.out.println(testA.getName());
    }
}
