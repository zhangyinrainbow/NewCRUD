package com.newcrud.service;

import com.newcrud.entity.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> getBlogs();
    List<Blog> getBlogByUserId(Integer userid);
    boolean insertBlog(Blog blog);
    boolean updateBlog(Blog blog);
    boolean deleteBlogById(Integer id);
}
