package com.newcrud.mapper;

import com.newcrud.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BlogMapper {
    List<Blog> getBlogs();
    List<Blog> getBlogByUserId(Integer id);
    boolean updateBlog(Blog blog);
    boolean deleteBlogById(Integer id);
    boolean insertBlog(Blog blog);
}
