package com.rzk.controller;

import com.rzk.pojo.User;
import com.rzk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Arrays;



@Controller
public class LoginController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Model model,HttpSession session){
        User user = userService.selectPasswordByName(username, password);
        if ( user != null){
            //登录成功！
            session.setAttribute("userName",user.getUserName());
            //登录成功！防止表单重复提交，我们重定向
            return "redirect:/main.html";
        }else {
            //登录失败！存放错误信息
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/user/Logout")
    public String logout(HttpSession session){

        session.invalidate();
        return "redirect:/index.html";
    }
}
