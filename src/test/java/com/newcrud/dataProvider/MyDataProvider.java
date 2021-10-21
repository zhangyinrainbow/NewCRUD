package com.newcrud.dataProvider;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
    //通过注解来表明这是一个TestNG的数据提供者
    @DataProvider(name = "lisi")
    //这里可以是静态方法，也可以去掉
    public static Object[][] getData(){
        Object[][] data = new Object[][]{
                {33},{44},{55}
        };
        return data;
    }
}
