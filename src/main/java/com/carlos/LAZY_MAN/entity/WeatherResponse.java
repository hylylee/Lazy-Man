package com.carlos.LAZY_MAN.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeatherResponse implements Serializable {

    private WeatherResponseData data;
    private Integer status;
    private String desc;

}
