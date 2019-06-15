package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/6/14/014.
 */

public class Suggestion {
    @SerializedName("comf")
    public ComFort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class ComFort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
