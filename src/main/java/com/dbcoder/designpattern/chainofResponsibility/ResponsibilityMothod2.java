package com.dbcoder.designpattern.chainofResponsibility;

public class ResponsibilityMothod2 implements Ihanlder {
    @Override
    public ChainResponsibilityResponse doHander(ChainResponsibilityRequest test) {
        ChainResponsibilityResponse response=new ChainResponsibilityResponse();
        response.setText("this is ResponsibilityMothod2");
        return response;
    }
}
