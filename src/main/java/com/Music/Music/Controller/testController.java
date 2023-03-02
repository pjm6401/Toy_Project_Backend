package com.Music.Music.Controller;

import com.Music.Music.DTO.TestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Music")
public class testController {
    TestDTO testDTO;
    @GetMapping("/hello")
    public TestDTO test(){
        System.out.println("Build react");
        testDTO = new TestDTO();
        testDTO.setId("1234@naver.com");
        testDTO.setPw("1234");
        testDTO.setName("Min_98");
        testDTO.setAge("24");
        return testDTO;
    }
}
