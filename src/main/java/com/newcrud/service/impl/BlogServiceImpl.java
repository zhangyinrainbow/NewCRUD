package com.newcrud.service.impl;

import com.newcrud.entity.Blog;
import com.newcrud.mapper.BlogMapper;
import com.newcrud.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//实现service层的对应接口
public class BlogServiceImpl implements BlogService {
    //引入对应的mapper层，因为其实在mapper层完成了xml文件的编写的时候，对应的接口已经实现了其增删改查的功能。
    @Autowired
    BlogMapper blogMapper;
    @Override
    public List<Blog> getBlogs() {
        return blogMapper.getBlogs();
    }

    @Override
    public List<Blog> getBlogByUserId(Integer userid) {
        return blogMapper.getBlogByUserId(userid);
    }

    @Override
    public boolean insertBlog(Blog blog) {
        return blogMapper.insertBlog(blog);
    }

    @Override
    public boolean updateBlog(Blog blog) {
        return blogMapper.updateBlog(blog);
    }

    @Override
    public boolean deleteBlogById(Integer id) {
        return blogMapper.deleteBlogById(id);
    }

    @Override
    public Blog getBlogById (Integer id){
        return blogMapper.getBlogById(id);
    }
}
