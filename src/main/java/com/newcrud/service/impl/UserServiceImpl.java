package com.newcrud.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newcrud.entity.User;
import com.newcrud.mapper.UserMapper;
import com.newcrud.outInParam.PageRequest;
import com.newcrud.outInParam.PageResult;
import com.newcrud.service.UserService;
import com.newcrud.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }
    /**
     * 一对多联合查询
     * */
    @Override
    public User getUserAndBlog(Integer id){
        return userMapper.getUserAndBlog(id);
    }
    /**
     * 一对多联合查询-union方式
     * */
    @Override
    public User getAllUserAndBlog(Integer id){
        return userMapper.getAllUserAndBlog(id);
    }
    @Override
    public List<User> getAllUser() {
        return userMapper.getUsers();
    }
    //新增1：controller入参的时候会传入PageRequest，通过PageRequest的方法获取页面的，当前页码和每一页的数据条数
    public PageInfo<User> getPageInfo(PageRequest pageRequest){
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum,pageSize);
        //通过mapper层，获取所有的用户信息
        List<User> userMenus=userMapper.getUsersPage();
        //将用户信息放到PageInfo中返回出去
        return  new PageInfo<User>(userMenus);
    }

    @Override
    //新增2：实现接口层的方法
    public PageResult getAllUserPage(PageRequest pageRequest){
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }

    @Override
    public Integer getUserIdByUserName(String username) {
        return userMapper.getUSerIdByUserName(username);
    }

    @Override
    public boolean insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public boolean deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User getJmeterUser(Integer id,String username){
        return userMapper.getUSerJmeter(id,username);
    }
    @Override
    public User getUserByUserName(String username){
        return userMapper.getUserByUserName(username);
    }
}
