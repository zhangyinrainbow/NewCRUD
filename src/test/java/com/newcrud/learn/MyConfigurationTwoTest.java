package com.newcrud.learn;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class MyConfigurationTwoTest extends AbstractTestNGSpringContextTests {

    @Test
    public void testGetKangShiFuThree() {
        //这个只是保留一个执行的入口，没有实际意义，我们要看的是启动信息
    }
}