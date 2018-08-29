package com.diva.coolweather.gson;

/**
 * Created by 刘迪 on 2018/8/29 09:45.
 * 邮箱：divaliu1408@qq.com
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
