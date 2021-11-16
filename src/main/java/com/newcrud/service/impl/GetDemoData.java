package com.newcrud.service.impl;

import com.newcrud.entity.DemoData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GetDemoData {
    public List<DemoData> getDemoData(){
        List<DemoData> list=new ArrayList<>();
        for (int i=0;i<=10;i++){
            DemoData demoData=new DemoData();
            demoData.setName("张三"+i);
            demoData.setDoubleData(i+0.56);
            demoData.setDate(new Date());
            list.add(demoData);
        }
        return list;
    }
}
