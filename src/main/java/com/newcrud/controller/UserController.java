package com.newcrud.controller;

import com.newcrud.entity.User;
import com.newcrud.outInParam.PageRequest;
import com.newcrud.outInParam.RequestParamOne;
import com.newcrud.outInParam.Result;
import com.newcrud.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/crud")
@CrossOrigin
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/user/{id}")
    public Result geyUserById(@PathVariable("id") Integer id){
        return Result.succ(userService.getUserById(id));
    }
    @RequestMapping(value = "userone",method = RequestMethod.POST)
    public Result getUserByIdPost(@RequestBody RequestParamOne requestParamOne){
        User user =  userService.getUserById(requestParamOne.getId());
        log.info("查询结果为：",user);
        if (user == null){
            //判断一下查询用户的结果，如果查询的结果为空，那就报失败,报错信息为我们手动填写，更自由
            return Result.fail(null,"新的报错：查询结果为空");
        }else {
            return Result.succ(user);
        }
    }
    @RequestMapping(value = "/username",method = RequestMethod.POST)
    public User getUserByUserName(@RequestParam(value = "username") String username){
        return userService.getUserByUserName(username);
    }
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public Result getUser(){
        // return userService.getAllUser();
        return Result.succ(userService.getAllUser());
    }
    //新增controler层方法，只需要传入PageRequest的类型对象就行
    @RequestMapping(value = "/page",method = RequestMethod.POST)
    public Object findPage(@RequestBody PageRequest pageRequest){
        return userService.getAllUserPage(pageRequest);
    }

}
