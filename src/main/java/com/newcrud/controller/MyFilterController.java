package com.newcrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/filter")
@RestController
public class MyFilterController {
    @GetMapping("/hello")
    public Map<String,String> getMessage(){
        Map<String,String> map=new HashMap<>();
        map.put("result","hello filter");
        return map;
    }
}
