package com.example.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 92974 on 2018/4/15.
 */

public class Now {

    @SerializedName("tmp")
    public String temprature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
