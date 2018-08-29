package com.diva.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 刘迪 on 2018/8/29 09:46.
 * 邮箱：divaliu1408@qq.com
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
