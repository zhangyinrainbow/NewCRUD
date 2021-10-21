package com.newcrud.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationTwo {
    @Bean
    public KangShiFuThree getKangShiFuThree(){
        return new KangShiFuThree();
    }
    @Bean
    public KangShiFuFour getKangShiFuFour(){
        getKangShiFuThree();
        return new KangShiFuFour();
    }
}
