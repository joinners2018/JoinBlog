package com.join.joinblog.service.user;

import com.join.joinblog.entity.user.User;

import java.util.List;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 22:04 2019/9/2
 */
public interface UserService {

    /**
     * 登录
     * @param user
     * @return
     * @throws Exception
     */
    public User login(User user) throws Exception;

    /**
     * 注册
     * @param user
     * @return
     * @throws Exception
     */
    public void addUser(User user) throws Exception;

    /**
     * 修改个人信息
     * @param user
     * @return
     * @throws Exception
     */
    public boolean updateUser(User user) throws Exception;

    /**
     * 删除
     * @param user
     * @return
     * @throws Exception
     */
    public boolean deleteUser(User user) throws Exception;

    /**
     * 列出所有user
     * @param
     * @return
     * @throws Exception
     */
    public List<User> listUser() throws Exception;

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
