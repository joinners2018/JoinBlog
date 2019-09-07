package com.join.joinblog.service;

import com.join.joinblog.entity.Blog;

import java.util.List;

/**
 * @Author:ljx
 * @Date:2019/9/6
 * @Description:
 */
public interface BlogService {
    void addBLog(int bloggerId,String title);
    List fuzzyQueryByTitle(String title);
    Blog queryById(int id);
    List queryByBloggerId(int bloggerId);
    List queryAll();
    void updateTitleById(String title,int id);
    void updatePvById(int id);
    void updateCommentsIdById(String commentsId,int id);
    void updateTagsById(String tags,int id);
    void deleteById(int id);
}
