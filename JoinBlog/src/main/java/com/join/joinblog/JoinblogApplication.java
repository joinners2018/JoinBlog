package com.join.joinblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.join.joinblog.mapper")
@SpringBootApplication
public class JoinblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoinblogApplication.class, args);
    }

}
