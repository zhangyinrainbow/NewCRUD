package com.newcrud.mapper;

import com.newcrud.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 这里有两种方法，一种是像我们一样使用@Mapper，一种是在CrudApplication上面新增了@MapperScan备注。直接扫描了整个包
 * https://www.cnblogs.com/JackpotHan/p/10286496.html
 * 不过不知道为啥，不加上这个好像是不行，没办法auto，稍微有那么点尴尬
 * **/
@Mapper
public interface UserMapper {
    List<User> getUsers();
    //新增getUsersPage，获取所有用户信息
    List<User> getUsersPage();
    User getUserById(Integer id);
    boolean insertUser(User user);
    boolean deleteUserById(Integer id);
    boolean updateUser(User user);
    User getUSerJmeter(Integer id,String username);
    User getUserByUserName(String username);
    Integer getUSerIdByUserName(String username);
}
