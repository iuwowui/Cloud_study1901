package com.qfedu.cloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *@Author feri
 *@Date Created in 2019/6/12 10:53
 */
@FeignClient(name = "HelloProvider")
public interface HelloService {
    @GetMapping("/hello/first.do")
    String first();
    @PostMapping("/hello/second.do")
    String sencod(@RequestParam("id") int id, @RequestParam("name") String name);
}
