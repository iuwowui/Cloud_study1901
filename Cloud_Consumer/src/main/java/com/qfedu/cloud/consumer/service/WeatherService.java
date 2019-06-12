package com.qfedu.cloud.consumer.service;

import com.qfedu.cloud.consumer.entity.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "HelloProvider")
public interface WeatherService {
    @PostMapping("weather/save.do")
    String save(@RequestBody Weather weather);

    @GetMapping("weather/all.do")
    public List<Weather> all(@RequestParam("page") int page, @RequestParam("count") int count);

}
