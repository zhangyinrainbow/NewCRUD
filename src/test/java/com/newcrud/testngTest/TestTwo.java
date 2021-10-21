package com.newcrud.testngTest;

import org.testng.annotations.*;

public class TestTwo {
    @Test
    public void testOne(){
        System.out.println("TestTwo的testOne");
    }
    @BeforeTest
    public void testThirteen(){
        System.out.println("@BeforeTest - 对于套件测试，在运行属于<test>标签内的类的任何测试方法之前运行。---TestTwo");
    }
    @AfterTest
    public void testFourteen(){
        System.out.println("@AfterTest - 对于套件测试，在运行属于<test>标签内的类的所有测试方法都已运行之后运行。------TestTwo");
    }
}
