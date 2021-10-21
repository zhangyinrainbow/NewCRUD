package com.newcrud.testngTest;

import org.testng.annotations.*;

public class TestOne {
    @Test
    public void testOne(){
        System.out.println("testOne");
    }
    @Test
    public void testTwo(){
        System.out.println("testTwo");
    }
    @Test(groups = "one")
    public void testThree(){
        System.out.println("testThree");
    }
    @Test(groups = "one")
    public void testFour(){
        System.out.println("testFour");
    }
    @Test(groups = "two")
    public void testFive(){
        System.out.println("testFive");
    }
    @Test(groups = "two")
    public void testSix(){
        System.out.println("testSix");
    }
    @BeforeSuite
    public void testSeven(){
        System.out.println("@BeforeSuite,对于套件测试，在此套件中的所有测试运行之前运行");
    }
    @AfterSuite
    public void testEight(){
        System.out.println("@AfterSuite,对于套件测试，在此套件中的所有测试运行之后运行。");
    }
    @BeforeClass
    public void testNine(){
        System.out.println("@BeforeClass,在当前类的第一个测试方法之前运行。");
    }
    @AfterClass
    public void testTen(){
        System.out.println("@AfterClass,运行当前类中的所有测试方法之后都运行。");
    }
    @BeforeGroups(groups = {"one","two"})
    public void testEleven(){
        System.out.println("@BeforeGroups：在调用属于该组的第一个测试方法之前运行.");
    }
    @AfterGroups(groups = {"one","two"})
    public void testTwelve(){
        System.out.println("@AfterGroups：在调用属于组的最后一个测试方法之后运行。");
    }
    @BeforeTest
    public void testThirteen(){
        System.out.println("@BeforeTest - 对于套件测试，在运行属于<test>标签内的类的任何测试方法之前运行。");
    }
    @AfterTest
    public void testFourteen(){
        System.out.println("@AfterTest - 对于套件测试，在运行属于<test>标签内的类的所有测试方法都已运行之后运行");
    }
    @BeforeMethod
    public void testFifteen(){
        System.out.println("@BeforeMethod - 在每个测试方法之前运行。");
    }
    @AfterMethod
    public void testSixteen(){
        System.out.println("@AfterMethod - 在每个测试方法之后运行。");
    }

}
