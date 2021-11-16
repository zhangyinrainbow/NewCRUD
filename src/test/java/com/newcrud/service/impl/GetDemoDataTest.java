package com.newcrud.service.impl;

import com.alibaba.excel.EasyExcel;
import com.newcrud.entity.DemoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import java.util.List;

@SpringBootTest
public class GetDemoDataTest extends AbstractTestNGSpringContextTests {
    @Autowired
    GetDemoData getDemoData;

    @Test
    public void testGetDemoData() {
        List<DemoData> list= getDemoData.getDemoData();
        String path = System.getProperty("user.dir");
        String localPath = path+"/src/main/java/com/newcrud/excel/";
        String fileName = localPath+"simpleWrite"+System.currentTimeMillis()+".xlsx";
        EasyExcel.write(fileName,DemoData.class).sheet("hello").doWrite(list);
     }

}