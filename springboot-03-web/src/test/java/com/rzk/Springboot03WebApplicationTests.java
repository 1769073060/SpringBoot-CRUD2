package com.rzk;


import com.rzk.pojo.User;
import com.rzk.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class Springboot03WebApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserService userService;

    @Test
    public void test(){
        User user = userService.selectPasswordByName("a", "123");
        System.out.println(user);
    }



}
