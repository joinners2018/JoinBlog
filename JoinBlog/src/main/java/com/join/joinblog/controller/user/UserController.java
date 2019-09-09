package com.join.joinblog.controller.user;

import com.join.joinblog.entity.user.User;
import com.join.joinblog.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 22:41 2019/9/2
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public User login(String username, String password) throws Exception{
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user=userService.login(user);
        System.out.println(user);
        return user;
    }

    /**
     * 注册
     * @param username
     * @param password
     * @throws Exception
     */
    @RequestMapping(value = "/addUser")
    public void addUser(String username, String password) throws Exception{
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.addUser(user);
    }

    /**
     * 更新个人信息
     * @param user
     * @throws Exception
     */
    @RequestMapping(value = "/update")
    public void updateUser(User user) throws Exception{
         System.out.println(userService.updateUser(user));
    }

    /**
     * 删除普通管理
     * @param user
     * @throws Exception
     */
    @RequestMapping(value = "/delete")
    public void deleteUser(User user) throws Exception{
        System.out.println(userService.deleteUser(user));

    }

    /**
     * 列出user
     * @param
     * @throws Exception
     */
    @RequestMapping(value = "/listUser")
    public void listUser() throws Exception{
        System.out.println(userService.listUser());

    }

}
