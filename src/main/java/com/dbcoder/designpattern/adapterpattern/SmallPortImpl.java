package com.dbcoder.designpattern.adapterpattern;

import org.springframework.stereotype.Service;

@Service("smallPort")
public class SmallPortImpl implements SmallPort {
    @Override
    public void userSmallPort() {
        System.out.println("用小端口");
    }
}
