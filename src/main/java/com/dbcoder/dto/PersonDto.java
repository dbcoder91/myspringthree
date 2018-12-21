package com.dbcoder.dto;


import javax.validation.constraints.NotNull;
import java.util.List;

public class PersonDto {
    @NotNull(message="不能为空")
    private String name;
    private int age;
    private List<TestDto> testDtos;

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

    public List<TestDto> getTestDtos() {
        return testDtos;
    }

    public void setTestDtos(List<TestDto> testDtos) {
        this.testDtos = testDtos;
    }
}
