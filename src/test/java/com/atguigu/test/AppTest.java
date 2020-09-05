package com.atguigu.test;


import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    @Test
    public void testUser(){
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    //整合数据源
    @Test
    public void testDataSource(){
        System.out.println(dataSource.getClass());
    }

}
