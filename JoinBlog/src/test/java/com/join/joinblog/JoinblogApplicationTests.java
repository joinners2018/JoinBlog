package com.join.joinblog;

import com.join.joinblog.controller.user.UserController;
import com.join.joinblog.entity.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JoinblogApplicationTests {

    @Autowired
    UserController userController;
    User user=new User();

    @Test
    public void contextLoads()throws Exception {


    }

    /**
     * 登录测试
     * @throws Exception
     */
    @Test
    public void loginTest()throws Exception {

        userController.login("yfn","123");

    }

    /**
     * 注册测试
     * @throws Exception
     */
    @Test
    public void addTest()throws Exception {


        userController.addUser("123","123");

    }

    /**
     * 更新个人信息测试
     * @throws Exception
     */
    @Test
    public void updateTest()throws Exception {

        user.setPassword("123123123");
        user.setUsername("jzz");
        user.setId(1);
        user.setSex("男");
        userController.updateUser(user);

    }

    /**
     * 列出所有user测试
     * @throws Exception
     */
    @Test
    public void listTest()throws Exception {

       userController.listUser();

    }

    /**
     * 删除
     * @throws Exception
     */
    @Test
    public void deleteTest()throws Exception {

        user.setId(4);
        userController.deleteUser(user);

    }

}
