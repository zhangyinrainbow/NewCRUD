package com.newcrud.service.impl;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class MyMockOneServiceImpl {
    public Integer getInt(Integer id){
        return id;
    }
    public String getString(String string){
        return string;
    }
    public Double getDouble(Double dd){
        return dd;
    }
    public Long getLong(Long ll){
        return ll;
    }
    public int[] getIntShuZu(int[] a){
        return a;
    }
    public List<Integer> getListInt(List<Integer> list){
        return list;
    }
    public List<String> getListString(List<String> list){
        return list;
    }
    public Map<Integer,String> getMap(Map<Integer,String> map){
        return map;
    }
    public void getVoid(){
        System.out.println("getVoid");
    }
    public RuntimeException getException(){
        RuntimeException exception=new RuntimeException();
        return exception;
    }
    public MyMockTwoServiceImpl getMyMockTwoService(){
        MyMockTwoServiceImpl myMockTwoService=new MyMockTwoServiceImpl();
        return myMockTwoService;
    }

}
