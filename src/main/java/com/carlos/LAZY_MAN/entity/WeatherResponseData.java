package com.carlos.LAZY_MAN.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class WeatherResponseData implements Serializable {
    private WeatherResponseYesterday yesterday;
    private String city;
    private List<WeatherResponseForecast> forecast;
    private String ganmao;
    private String wendu;
}
