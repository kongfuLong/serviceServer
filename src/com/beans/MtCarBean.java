package com.beans;

/**
 * Created by rcl on 2015/10/5.
 */
public class MtCarBean {

    private String car_id;
    private String user_id;
    private String user_name;
    private String user_phone;
    private Integer brand_id;
    private Integer car_model_id;
    private Integer car_conf_id;
    private String car_name;
    private String vin;
    private String car_no;
    private String buy_date;
    private String car_km;

    public MtCarBean() {
    }

    public String getCar_id() {
        return car_id;
    }

    public void setCar_id(String car_id) {
        this.car_id = car_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getCar_model_id() {
        return car_model_id;
    }

    public void setCar_model_id(int car_model_id) {
        this.car_model_id = car_model_id;
    }

    public int getCar_conf_id() {
        return car_conf_id;
    }

    public void setCar_conf_id(int car_conf_id) {
        this.car_conf_id = car_conf_id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCar_no() {
        return car_no;
    }

    public void setCar_no(String car_no) {
        this.car_no = car_no;
    }

    public String getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(String buy_date) {
        this.buy_date = buy_date;
    }

    public String getCar_km() {
        return car_km;
    }

    public void setCar_km(String car_km) {
        this.car_km = car_km;
    }
}
