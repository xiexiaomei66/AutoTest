package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法11111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法22222");

    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户组端组的测试方法33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户组端组的测试方法44444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前的运行方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后的运行方法！");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnclient(){
        System.out.println("这是客户端组运行之前的运行方法！！");
    }
    @AfterGroups("client")
    public void afterGroupsOnclien(){
        System.out.println("这是客户端组运行之后的运行方法！！！！！");
    }

}
