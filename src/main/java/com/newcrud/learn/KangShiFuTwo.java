package com.newcrud.learn;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class KangShiFuTwo {
    String name;
    Integer age;
    public void getKangShiFuTwo(){
        System.out.println("getKangShiFuTwo");
    }
}
