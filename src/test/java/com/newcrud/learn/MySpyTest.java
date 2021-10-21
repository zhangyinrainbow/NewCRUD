package com.newcrud.learn;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.when;
import static org.testng.Assert.*;
@Ignore
@SpringBootTest
public class MySpyTest extends AbstractTestNGSpringContextTests {
    @Spy
    MySpy mySpy;
    @BeforeClass
    public void initMocks(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFun() {
        mySpy.fun();
        Assert.assertEquals(1,1);
        System.out.println("=======");
    }

    @Test
    public void testFunOne() {
        mySpy.funOne();
        Assert.assertEquals(1,1);
        System.out.println("=======");

    }

    @Test
    public void testFunTwo() {
        Assert.assertEquals(1,1);
        mySpy.funTwo();
        System.out.println("=======");

    }

    @Test
    public void testGetMath() {
        Assert.assertEquals(1,2,"错误");
        System.out.println(mySpy.getMath());
    }
    @Test
    public void testGetMathTwo(){
        when(mySpy.getMath()).thenReturn(200);
        System.out.println(mySpy.getMath());
        Reporter.log("hello");
    }

}