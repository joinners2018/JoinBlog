package com.join.joinblog.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author:ljx
 * @Date:2019/9/5
 * @Description: 博客实体类
 */
public class Blog {
    private int id;
    private int pv;
    private String releaseTime;
    private String commentsId;
    private int bloggerId;
    private String tags;
    private String title;

    public Blog(int bloggerId, String title){
        this.bloggerId=bloggerId;
        this.title=title;

        this.pv=0;
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        this.releaseTime=dateFormat.format(date);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(String commentsId) {
        this.commentsId = commentsId;
    }

    public int getBloggerId() {
        return bloggerId;
    }

    public void setBloggerId(int bloggerId) {
        this.bloggerId = bloggerId;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", pv=" + pv +
                ", releaseTime='" + releaseTime + '\'' +
                ", commentsId='" + commentsId + '\'' +
                ", bloggerId=" + bloggerId +
                ", tags='" + tags + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
