package com.newcrud.testngTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFour  {
    @Test
    public void testA()  {
        System.out.println("testAmaster");
        Assert.assertEquals(1,1);
    }

    @Test
    public void testB(){
        System.out.println("testB");
        Assert.assertEquals(1,1);
    }
}
