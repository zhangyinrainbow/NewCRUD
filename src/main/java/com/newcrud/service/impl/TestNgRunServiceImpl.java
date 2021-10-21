package com.newcrud.service.impl;

import com.newcrud.service.TestNgRunService;
import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Service;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestNgRunServiceImpl implements TestNgRunService {
    @Override
    public void runAll() {
        TestNG testNone=new TestNG();
        List<String> list=new ArrayList<>();
        list.add("testng.xml");
        testNone.setTestSuites(list);
        testNone.run();
    }

    @Override
    public void runFail() {
        TestNG testNTwo = new TestNG();
        List<String> list=new ArrayList<>();
        list.add("test-output/testng-failed.xml");
        testNTwo.setTestSuites(list);
        testNTwo.run();
    }
}
