package com.newcrud.learn;

import lombok.Data;

@Data
public class KangShiFuFour {
    public  KangShiFuFour(){
        System.out.println("getKangShiFuFour");
    }
    String name;
    Integer age;
}
