package com.qfedu.cloud.provider.entity;

/**
 *@Author feri
 *@Date Created in 2019/6/12 11:08
 */
public class Weather {
    private int id;
    private double tem;//温度
    private int wind;//风
    private String info;//适宜事情

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", tem=" + tem +
                ", wind=" + wind +
                ", info='" + info + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTem() {
        return tem;
    }

    public void setTem(double tem) {
        this.tem = tem;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
