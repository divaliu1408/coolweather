package com.diva.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 刘迪 on 2018/8/29 09:48.
 * 邮箱：divaliu1408@qq.com
 */

public class Suggestion {
    /**
     * comf : {"type":"comf","brf":"较不舒适","txt":"白天天气多云，有风，但会感到有些热，不很舒适。"}
     * sport : {"type":"sport","brf":"较适宜","txt":"天气较好，但因气温较高且风力较强，请适当降低运动强度并注意户外防风。"}
     * cw : {"type":"cw","brf":"较不宜","txt":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。"}
     */

    @SerializedName("comf")
    public Comfort comfort;
    public Sport sport;
    @SerializedName("cw")
    public CarWash carWash;

    public Comfort getComfort() {
        return comfort;
    }

    public void setComfort(Comfort comfort) {
        this.comfort = comfort;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public CarWash getCarWash() {
        return carWash;
    }

    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
    }

    public class Comfort {
        /**
         * type : comf
         * brf : 较不舒适
         * txt : 白天天气多云，有风，但会感到有些热，不很舒适。
         */

        private String type;
        private String brf;

        @SerializedName("txt")
        private String info;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBrf() {
            return brf;
        }

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public String getInfo() {
            return info;
        }

        public void seInfo(String info) {
            this.info = info;
        }
    }

    public static class Sport {
        /**
         * type : sport
         * brf : 较适宜
         * txt : 天气较好，但因气温较高且风力较强，请适当降低运动强度并注意户外防风。
         */

        private String type;
        private String brf;
        @SerializedName("txt")
        private String info;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBrf() {
            return brf;
        }

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }

    public static class CarWash {
        /**
         * type : cw
         * brf : 较不宜
         * txt : 较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。
         */

        private String type;
        private String brf;
        @SerializedName("txt")
        private String info;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBrf() {
            return brf;
        }

        public void setBrf(String brf) {
            this.brf = brf;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }
    }
}
