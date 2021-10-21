package com.newcrud.learn;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNgListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("onTestStart仅在启动任何测试方法时才调用onTestStart()"+iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("onTestSuccess用例执行成功"+iTestResult.getName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("onTestFailure用例执行失败"+iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        //就比如你的一个方法依赖的方法执行失败了，导致你这个方法被跳过了，这个时候你就可以对跳过执行的用例进行一种补偿措施
        System.out.println("onTestSkipped跳过测试"+iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("emmm，这个我也不知道干什么的，但是平时也不用");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("onStart在任何测试方法开始时执行"+iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("onFinish任何测试用例完成执行时, 都会调用onFinish()"+iTestContext.getName());
    }
}
