package com.dbcoder.designpattern.chainofResponsibility;

public class ResponsibilityMothod1 implements Ihanlder {
    @Override
    public ChainResponsibilityResponse doHander(ChainResponsibilityRequest test) {
        ChainResponsibilityResponse response=new ChainResponsibilityResponse();
        response.setText("this is ResponsibilityMothod1");
        return response;
    }
}
