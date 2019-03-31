package com.course.testng.suite;

import org.testng.annotations.*;

//套件运行之前方法，比如共有的方法
public class SuiteConfig {
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("beforesuite运行啦！");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("aftersuite运行啦！");
    }
    @BeforeTest
    public  void beforeTest(){
        System.out.println("beforetest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("aftertest");
    }

}
