package com.qfedu.cloud.provider.controller;

import com.qfedu.cloud.provider.entity.Weather;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WeatherController {

    @PostMapping("weather/save.do")
    public String save(@RequestBody Weather weather){
        System.out.println("新增" + weather);
        return "Ok";
    }

    @GetMapping("weather/all.do")
    public List<Weather> all(@RequestParam("page") int page,@RequestParam("count") int count){
        List<Weather> weathers = new ArrayList<>();
        int s = (page - 1) * count;
        for (;s < page*count;s++){
            Weather weather = new Weather();
            weather.setId(s);
            weather.setInfo("适合学习java" + s);
            weather.setTem(s);
            weather.setWind(s % 10);
            weathers.add(weather);
        }
        return weathers;
    }
}
