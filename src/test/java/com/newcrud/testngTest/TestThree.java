package com.newcrud.testngTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestThree {
    @Test
    public void testA(){
        System.out.println("testA");
        Assert.assertEquals(1,2);
    }
    @Test
    public void testB(){
        System.out.println("testB");
        Assert.assertEquals(1,1);
    }
}
