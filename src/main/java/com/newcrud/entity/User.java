package com.newcrud.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String username;
    private String avatar;
    private String email;
    private String password;
    private Integer status;
    private String created;
    private String last_login;
    /**
     * 由于一个作者对应了多篇博客，所以这里用List来加入Blog
     * */
    private List<Blog> blogs;
}
