package com.newcrud.controller;

import com.newcrud.entity.MyListenerEntity;
import com.newcrud.service.impl.MyListenerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/listener")
public class MyListenerController {
    @Autowired
    MyListenerImpl myListener;
    @GetMapping("my")
    public MyListenerEntity getMyListenerEntity(){
        return  myListener.getMyListenerEntity();
    }
    @GetMapping("much")
    public String getHowMuch(HttpServletRequest httpServletRequest){
        Integer count = (Integer) httpServletRequest.getSession().getServletContext().getAttribute("count");
        return "一共几个人呢："+count;
    }
}
