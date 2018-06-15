package com.dbcoder.dto;

public class PersonDto {
    private String name;
    private int age;

    @Override
    public String toString(){
        return "{"+this.name+" "+this.age+"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
