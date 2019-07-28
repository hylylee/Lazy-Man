package com.carlos.LAZY_MAN.service.impl;

import com.carlos.LAZY_MAN.entity.WeatherResponse;
import com.carlos.LAZY_MAN.service.WeatherService;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public WeatherResponse getWeatherByCityName(String cityName) {
        String uri="http://wthrcdn.etouch.cn/weather_mini?city="+cityName;
        ResponseEntity<String> respString=restTemplate.getForEntity(uri,String.class);
        ObjectMapper mapper=new ObjectMapper();
        WeatherResponse resp=null;
        String strBody=null;
        if(respString.getStatusCodeValue()==200){
            strBody=respString.getBody();
        }
        try {
            resp=mapper.readValue(strBody,WeatherResponse.class);
        }catch (IOException e){
            e.printStackTrace();
        }
        return resp;
    }
}
