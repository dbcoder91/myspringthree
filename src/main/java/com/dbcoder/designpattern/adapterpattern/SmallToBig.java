package com.dbcoder.designpattern.adapterpattern;

public class SmallToBig implements Bigport {

    private SmallPort smallPort;

    public SmallToBig(SmallPort smallPort){
        this.smallPort = smallPort;
    }

    @Override
    public void userBigPort() {
        
    }
}
