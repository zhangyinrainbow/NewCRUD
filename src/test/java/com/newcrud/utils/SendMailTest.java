package com.newcrud.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
@SpringBootTest
public class SendMailTest extends AbstractTestNGSpringContextTests {
    @Autowired
    SendMail sendMail;

    @Test
    public void testSendMail() {
        sendMail.sendMail();
    }
}