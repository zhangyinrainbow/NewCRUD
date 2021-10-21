package com.newcrud.learn;

import lombok.Data;

@Data
public class KangShiFuOne {
    String name;
    Integer age;
    public void getKangShiFuOne(){
        System.out.println("getKangShiFuOne");
    }
}
