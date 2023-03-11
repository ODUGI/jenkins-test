package com.example.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String testMethod(){
        return "테스트 완료!";
    }

    @GetMapping("/test2")
    public String testMethod2(){
        return "새로운 테스트 확인 완료!";
    }

    @GetMapping("/test3")
    public String testMethod3(){
        return "버젼 업그레이드 완료!";
    }

    @GetMapping("/test4")
    public String testMethod4(){
        return "웹 훅 설정 완료!";
    }
}
