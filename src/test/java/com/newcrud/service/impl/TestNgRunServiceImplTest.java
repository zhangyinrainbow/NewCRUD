package com.newcrud.service.impl;

import com.newcrud.utils.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@SpringBootTest
public class TestNgRunServiceImplTest extends AbstractTestNGSpringContextTests {
    @Autowired
    TestNgRunServiceImpl testNgRunService;
    @Autowired
    SendMail sendMail;
    @Test
    public void testRunAll() {
        testNgRunService.runAll();
        sendMail.sendMail();
    }

    @Test
    public void testRunFail() {
        testNgRunService.runFail();
        sendMail.sendMail();
    }
}