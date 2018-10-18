package com.dbcoder.designpattern.chainofResponsibility;

public interface Ichain {
    ChainResponsibilityResponse proceed(ChainResponsibilityRequest request);
}
