package com.example.coolweather.gson;

/**
 * Created by Administrator on 2019/6/14/014.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
