package com.diva.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 刘迪 on 2018/8/29 09:59.
 * 邮箱：divaliu1408@qq.com
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public  Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
