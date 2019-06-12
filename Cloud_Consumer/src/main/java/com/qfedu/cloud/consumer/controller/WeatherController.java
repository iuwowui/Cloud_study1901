package com.qfedu.cloud.consumer.controller;

import com.qfedu.cloud.consumer.entity.Weather;
import com.qfedu.cloud.consumer.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    @PostMapping("api/weather/save.do")
    public String save(@RequestBody Weather weather){
        return weatherService.save(weather);
    }

    @GetMapping("api/weather/all.do")
    public List<Weather> all(int page,int count){
        return weatherService.all(page,count);
    }
}
