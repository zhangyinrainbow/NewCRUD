package com.newcrud.service.impl;

import com.newcrud.entity.Blog;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import static org.testng.Assert.*;
@SpringBootTest

public class BlogServiceImplTest extends AbstractTransactionalTestNGSpringContextTests {
    @Mock
    //@Mock(answer = Answers.RETURNS_SMART_NULLS)
    //@Mock(answer = Answers.RETURNS_DEFAULTS)
    //@Mock(answer = Answers.RETURNS_DEEP_STUBS)
    //@Mock(answer = Answers.CALLS_REAL_METHODS)
    //@Mock(answer = Answers.RETURNS_MOCKS)
    BlogServiceImpl blogService;
    @BeforeClass
    public void intiMocks(){
        System.out.println("BeforeClass");
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testDeleteBlogById() {
        List<Blog> list=new ArrayList<Blog>();
        Blog blog=new Blog();
        blog.setId(1);
        list.add(blog);
        when(blogService.getBlogByUserId(999)).thenReturn(list);
        System.out.println(blogService.getBlogByUserId(999));
    }
}