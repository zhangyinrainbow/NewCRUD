package com.newcrud.service.impl;

import org.springframework.stereotype.Component;

@Component
public class MyMockTwoServiceImpl {
    //这个是为了验证深度mock
    public Integer getTwo(Integer id){
        return id;
    }
}
