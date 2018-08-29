package com.diva.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 刘迪 on 2018/8/29 09:55.
 * 邮箱：divaliu1408@qq.com
 */

public class Forecast {

    /**
     * date : 2018-08-28
     * cond : {"txt_d":"多云"}
     * tmp : {"max":"34","min":"27"}
     */

    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public More getMore() {
        return more;
    }

    public void setMore(More more) {
        this.more = more;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public static class More {
        /**
         * txt_d : 多云
         */

        @SerializedName("txt_d")
        private String info;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

    public static class Temperature {
        /**
         * max : 34
         * min : 27
         */

        private String max;
        private String min;

        public String getMax() {
            return max;
        }

        public void setMax(String max) {
            this.max = max;
        }

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
        }
    }
}
