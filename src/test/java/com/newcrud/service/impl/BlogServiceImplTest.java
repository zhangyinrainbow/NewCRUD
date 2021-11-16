package com.newcrud.service.impl;

import com.newcrud.entity.Blog;
import com.newcrud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest

public class BlogServiceImplTest extends AbstractTransactionalTestNGSpringContextTests {
    @Autowired
    BlogServiceImpl blogService;

}