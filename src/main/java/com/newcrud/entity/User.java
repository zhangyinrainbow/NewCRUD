package com.newcrud.entity;

import lombok.Data;

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
}
