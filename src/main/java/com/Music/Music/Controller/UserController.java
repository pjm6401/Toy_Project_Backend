package com.Music.Music.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

/*
    회원 Controller
    Register : 회원가입
    LogIn : 로그인
    LogOut : 로그아웃
 */
@RestController
@RequestMapping("/Music")
public class UserController {

    @PostMapping("/register")
    public String Register(){
        return "";
    }
    @PostMapping("/logIn")
    public String Login(){
        return "";
    }
    @GetMapping("/logOut")
    public String LogOut(){
        return "";
    }

}
