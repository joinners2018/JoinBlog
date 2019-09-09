package com.join.joinblog.entity.user;

/**
 * @Author: Yangfn
 * @Description:
 * @Date: 21:54 2019/9/2
 */
public class User {

    int id;
    String username;
    String sex;
    String password;
    String headUrl;
    int blogId;
//    Fans fans;
//    Follow follow;
//    Favourite favourite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
