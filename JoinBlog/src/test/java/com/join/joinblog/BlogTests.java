package com.join.joinblog;

import com.join.joinblog.controller.BlogController;
import com.join.joinblog.entity.Blog;
import com.join.joinblog.service.impl.BlogServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogTests {
    @Autowired
    BlogServiceImpl blogService;

    @Test
    public void testFuzzyQueryByTitle() {
        System.out.println(blogService.fuzzyQueryByTitle("的"));
    }

    @Test
    public void testUpdateTitleById(){
        blogService.updateTitleById("挪威的森林",1);
        System.out.println(blogService.fuzzyQueryByTitle("的"));
    }

    @Test
    public void testAddBlog(){
        blogService.addBLog(1,"tsxsb");
    }

    @Test
    public void testQueryById(){
        System.out.println(blogService.queryById(0));
    }

    @Test
    public void testQueryByBloggerId(){
        System.out.println(blogService.queryByBloggerId(1));
    }

    @Test
    public void testQueryAll(){
        System.out.println(blogService.queryAll());
    }

    @Test
    public void testUpdatePvById(){
        blogService.updatePvById(1);
    }

    @Test
    public void testUpdateCommentsIdById(){
        blogService.updateCommentsIdById("100",1);
    }

    @Test
    public void testUpdateTagsById(){
        blogService.updateTagsById("java",1);
    }

    @Test
    public void testDeleteById(){
        blogService.deleteById(2);
    }

}
