package com.newcrud.controller;

import com.newcrud.entity.Blog;
import com.newcrud.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crud")
@CrossOrigin
public class BlogController {
    @Autowired
    private BlogServiceImpl blogServiceImpl;
    @RequestMapping(value = "/getById",method = RequestMethod.POST)
    public List<Blog> getBlogById(@RequestParam(value = "id") Integer id){
        return blogServiceImpl.getBlogByUserId(id);
    }
    @GetMapping("/blogs")
    public List<Blog> getAll(){
        return blogServiceImpl.getBlogs();
    }
}
