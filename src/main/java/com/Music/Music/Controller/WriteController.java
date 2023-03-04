package com.Music.Music.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    작성 Controller
    MusicWritePage : 음악 작성
    CommentWrite : 개시글에 댓글작성
 */
@RestController
@RequestMapping("/Music")
public class WriteController {
    @PostMapping("/musicWrite")
    public String MusicWrite(){
        return "";
    }
    @PostMapping("/commentWrite")
    public String CommentWrite(){
        return "";
    }
}
