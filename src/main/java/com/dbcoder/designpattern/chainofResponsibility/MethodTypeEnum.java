package com.dbcoder.designpattern.chainofResponsibility;

/**
* @Description:
* @author: bo.dong
* @Date: 2018-10-18 13:46:09
*/
public enum MethodTypeEnum {

    METHOD_ONE(1,"方法一"),
    METHOD_TWO(2,"方法二");

    private Integer key;
    private String value;

    MethodTypeEnum(Integer key, String value){
        this.key=key;
        this.value=value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
