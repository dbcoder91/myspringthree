package com.dbcoder.enumtest;

public enum TestTypeEnum {
    ONE(1,"测试一"),
    TWO(2,"测试二");

    private Integer key;
    private String name;

    TestTypeEnum(Integer key,String name){
        this.key=key;
        this.name=name;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String GetTestName(String name){
        return name+"TestTypeEnum.GetTestName";
    }
}
