package com.diva.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 刘迪 on 2018/8/29 09:42.
 * 邮箱：divaliu1408@qq.com
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
