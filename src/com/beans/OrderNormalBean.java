package com.beans;


import java.io.Serializable;

/**
 * Created by hty070503 on 2014/10/25.
 * 正常下单使用该bean
 */
public class OrderNormalBean extends OrderInfo implements Serializable {

    private String goodsJson;
    private String sellerJson;
    private String server_id;
    private Integer car_id = 0;
    private String carJson ;


    public OrderNormalBean() {
    }

    public String getCarJson() {
        return carJson;
    }

    public void setCarJson(String carJson) {
        this.carJson = carJson;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getServer_id() {
        return server_id;
    }

    public void setServer_id(String server_id) {
        this.server_id = server_id;
    }






    public String getGoodsJson() {
        return goodsJson;
    }

    public void setGoodsJson(String goodsJson) {
        this.goodsJson = goodsJson;
    }

    public String getSellerJson() {
        return sellerJson;
    }

    public void setSellerJson(String sellerJson) {
        this.sellerJson = sellerJson;
    }
}
