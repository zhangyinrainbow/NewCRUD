package com.newcrud.service;

import com.newcrud.entity.User;
import com.newcrud.outInParam.PageRequest;
import com.newcrud.outInParam.PageResult;

import java.util.List;

public interface UserService {
    User getUserById(Integer id);
    List<User> getAllUser();
    boolean insertUser(User user);
    boolean deleteUserById(Integer id);
    // 新增分页查询service接口层
    PageResult getAllUserPage(PageRequest pageRequest);
    boolean updateUser(User user);
    User getJmeterUser(Integer id,String username);
    User getUserByUserName(String username);
    Integer getUserIdByUserName(String username);
}
