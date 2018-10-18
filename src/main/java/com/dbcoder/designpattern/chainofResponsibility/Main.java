package com.dbcoder.designpattern.chainofResponsibility;

public class Main {
    public static void main(String[] args) {
        ChainResponsibilityRequest request1=new ChainResponsibilityRequest();
        request1.setMethodType(MethodTypeEnum.METHOD_ONE.getKey());

        ChainMethod chainMethod=new ChainMethod();
        chainMethod.execute(request1);
    }
}
