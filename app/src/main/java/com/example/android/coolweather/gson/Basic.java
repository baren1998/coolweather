package com.example.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 92974 on 2018/4/15.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
