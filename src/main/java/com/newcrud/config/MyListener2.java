package com.newcrud.config;

import org.springframework.stereotype.Component;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@Component
public class MyListener2 implements HttpSessionListener {
    public static Integer count = 0;   //记录在线的用户数量
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("新来了一个");
        count++;
        se.getSession().getServletContext().setAttribute("count",count);
    }
}
