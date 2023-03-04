package com.Music.Music.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    메인페이지 Controller
    Card 형식으로 페이지 띄워주기
    Home : 목록출력
 */
@RestController
@RequestMapping("/Music")
public class HomeController {
    @GetMapping
    public String Home (){

        return "home";
    }
}
