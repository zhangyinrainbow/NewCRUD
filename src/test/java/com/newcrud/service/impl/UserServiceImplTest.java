package com.newcrud.service.impl;

import com.newcrud.entity.Blog;
import com.newcrud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.jws.soap.SOAPBinding;
import java.util.List;

import static org.testng.Assert.*;

@SpringBootTest
public class UserServiceImplTest  extends AbstractTestNGSpringContextTests {
    @Autowired
    UserServiceImpl userService;
    @Test
    public void testGetUserById() {
        User users = userService.getUserAndBlog(1);
        System.out.println(users);

    }
    @Test
    public void testGetAllUser(){
        List<User> users=userService.getAllUser();
        for (User user: users){
            System.out.println(user);
        }
    }
    @Test
    public void testgetAllUserAndBlog(){
        User user = userService.getAllUserAndBlog(1);
        System.out.println(user);
    }

}