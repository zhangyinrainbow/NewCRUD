package com.newcrud.learn;

import lombok.Data;

@Data
public class MySpy {
    int a=100;
    public void fun(){
        System.out.println("fun");
        funOne();
        funTwo();
    }
    public void funOne(){
        System.out.println("funOne");
    }
    public void funTwo(){
        System.out.println("funTwo");
    }
    public Integer getMath(){
        return a;
    }
}
