package com.qfedu.cloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/first.do")
    public String hi(){
        System.out.println("服务提供者：");
        return "Ok";
    }

    @PostMapping("/hello/second.do")
    public String second(@RequestParam("id") int id,@RequestParam("name") String name){
        System.out.println("服务提供者：" + id + "-->" + "name");
        return "OK";
    }
}
