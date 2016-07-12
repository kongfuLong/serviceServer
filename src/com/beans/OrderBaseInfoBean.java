package com.beans;

/**
 * Created by rcl on 2015/8/27.
 * <p/>
 * 此bean专门接收前台传回来的基础订单信息
 */
public class OrderBaseInfoBean {

    private String orderId;
    private String orderTime;
    private String buyerId;
    private Integer country_id = 23;
    private Integer province_id = 0;
    private Integer city_id = 0;
    private Integer area_id = 0;
    private String phone = "";
    private String address = "";
    private String receiver = "";
    private String car_id = "0";
    private String active_id = "0";//活动id  活动下单用
    private String token = "";
    private String refer_ip;

    public OrderBaseInfoBean() {

    }

    public String getRefer_ip() {
        return refer_ip;
    }

    public void setRefer_ip(String refer_ip) {
        this.refer_ip = refer_ip;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getActive_id() {
        return active_id;
    }

    public void setActive_id(String active_id) {
        this.active_id = active_id;
    }

    public String getCar_id() {
        return car_id;
    }

    public void setCar_id(String car_id) {
        this.car_id = car_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getBuyerId() {
        return buyerId;
    }


    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }
}
