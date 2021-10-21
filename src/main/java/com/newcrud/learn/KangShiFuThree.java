package com.newcrud.learn;

import lombok.Data;

@Data
public class KangShiFuThree {
    public  KangShiFuThree(){
        System.out.println("getKangShiFuThree");
    }
    String name;
    Integer age;
}
