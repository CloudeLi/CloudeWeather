package com.weather.cloude.cloudeweather.db;

/**
 * Created by Administrator on 2017/7/28.
 */

public class Province {
    private int id;
    private String provinceName;
    private int provinceClde;
    public int getId(){
        return id;

    }

    public void setId(int id){
        this.id = id ;

    }
    public String getProvinceName(){
        return provinceName;
    }
    public  void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public  int getProvinceClde(){
        return getProvinceClde();
    }
    public  void setProvinceClde(){
        this.provinceClde = provinceClde;
    }
}
