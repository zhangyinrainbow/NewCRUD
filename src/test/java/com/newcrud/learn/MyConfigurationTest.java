package com.newcrud.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
@SpringBootTest
public class MyConfigurationTest extends AbstractTestNGSpringContextTests {
    @Autowired
    KangShiFuOne kangShiFuOne;

    @Test
    public void testGetKangShiFuTwoConfig() {
        kangShiFuOne.getKangShiFuOne();
    }
}