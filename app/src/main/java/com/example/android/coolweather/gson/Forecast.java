package com.example.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 92974 on 2018/4/15.
 */

public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Temprature temprature;

    public class Temprature {
        public String max;

        public String min;
    }
}
