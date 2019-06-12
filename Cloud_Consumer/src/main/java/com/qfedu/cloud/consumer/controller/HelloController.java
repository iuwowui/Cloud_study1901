package com.qfedu.cloud.consumer.controller;

import com.qfedu.cloud.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2019/6/12 10:57
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("api/hello/num1.do")
    public String num1(){
        return helloService.first();
    }
    @PostMapping("api/hello/num2.do")
    public String num2(int id, String name){
       return helloService.sencod(id, name);
    }
}
