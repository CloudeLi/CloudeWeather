package com.weather.cloude.cloudeweather.db;

/**
 * Created by Administrator on 2017/7/28.
 */

public class City  extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private  int provinceID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }


}
