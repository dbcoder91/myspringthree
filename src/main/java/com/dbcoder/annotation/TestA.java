package com.dbcoder.annotation;

import org.springframework.stereotype.Component;

@Component
public class TestA {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
