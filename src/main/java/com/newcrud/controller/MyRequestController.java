package com.newcrud.controller;

import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

@RestController
@RequestMapping("/request")
public class MyRequestController {
    @RequestMapping(value = "/my3",method = RequestMethod.POST)
    public void getUserByUserName3(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws UnsupportedEncodingException {
        HttpSession session=httpServletRequest.getSession();
        System.out.println(session);
        String name = httpServletRequest.getParameter("username");
        System.out.println(name);
        httpServletRequest.setCharacterEncoding("UTF-8");
        String[] name2 = httpServletRequest.getParameterValues("username");
        System.out.println(Arrays.toString(name2));
        System.out.println(httpServletRequest.getMethod());
        httpServletResponse.setHeader("hello","world");
        httpServletResponse.setStatus(500);
    }
}
