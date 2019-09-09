package com.join.joinblog.controller;

import com.join.joinblog.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author:ljx
 * @Date:2019/9/6
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class BlogController {
    @Autowired
    private BlogServiceImpl blogService;

    @RequestMapping("query/{id}")
    @ResponseBody
    public String queryById(@PathVariable int id){
        return blogService.queryById(id).toString();
    }
}
