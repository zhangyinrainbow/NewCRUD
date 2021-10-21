package com.newcrud.entity;

import lombok.Data;

@Data
public class Blog {
    private Integer id;
    private Integer user_id;
    private String title;
    private String description;
    private String content;
    private String created;
    private Integer status;
}
