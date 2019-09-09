package com.join.joinblog.service.user.impl;

import com.join.joinblog.entity.user.User;
import com.join.joinblog.mapper.user.UserMapper;
import com.join.joinblog.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 22:03 2019/9/2
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    /**
     * 登录
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public User login(User user) throws Exception{
        User user1=userMapper.login(user);
        return user1;
    }

    /**
     * 注册
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public void addUser(User user) throws Exception{
        System.out.println("in_service");
        userMapper.addUser(user);
        System.out.println("out_service");
        //return userMapper.addUser(user);
    }

    /**
     * 修改个人信息
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateUser(User user) throws Exception{
        boolean b=userMapper.updateUser(user);
        return b;
    }
    /**
     * 删除
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteUser(User user) throws Exception{
        boolean b=userMapper.deleteUser(user);
        return b;
    }
    /**
     * 删除
     * @param
     * @return
     * @throws Exception
     */
    @Override
    public List<User> listUser() throws Exception{
        return userMapper.listUser();
    }

    /**
     * 收藏博客
     */
    //public boolean collectBlog(User user,Blog blog) throws Exception;

    /**
     * 评论
     */
    //public boolean addComment(User user,Comment comment) throws Exception;

    /**
     *关注
     */
    //public boolean followOther(User user_my,User user) throws Exception;

    /**
     * 收藏
     */
    //public boolean addBlogToFav(User user,Blog blog) throws Exception;


}
