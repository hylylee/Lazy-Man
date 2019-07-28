package com.carlos.LAZY_MAN.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeatherResponseForecast implements Serializable {
    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;
}
