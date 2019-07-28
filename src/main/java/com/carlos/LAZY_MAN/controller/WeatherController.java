package com.carlos.LAZY_MAN.controller;

import com.carlos.LAZY_MAN.entity.WeatherResponse;
import com.carlos.LAZY_MAN.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/{cityName}")
    public WeatherResponse getNews(@PathVariable String cityName) {
        return weatherService.getWeatherByCityName(cityName);
    }

}
