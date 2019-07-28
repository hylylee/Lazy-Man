package com.carlos.LAZY_MAN.service;

import com.carlos.LAZY_MAN.entity.WeatherResponse;

public interface WeatherService {
    WeatherResponse getWeatherByCityName(String cityName);
}
