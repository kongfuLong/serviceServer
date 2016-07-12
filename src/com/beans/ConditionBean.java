package com.beans;

import java.io.Serializable;

/**
 * Created by hty070503 on 2015/5/7.
 */
public class ConditionBean implements Serializable {

    private int priceId = 3;
    //区域限制
    private boolean ifAreaLimit = false;

    //调货
    private boolean ifAllocat = false;
    private double tax = 0;

    //会员
    private boolean ifVIP = false;
    private int discountClazz = 1;
    private double discount = 1d;
    private int priceType = 3;
    private int userType = 1;//实际账户类型权限


    private String error;
    private String messge;

    public ConditionBean() {

    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
    }

    public boolean isIfVIP() {
        return ifVIP;
    }

    public void setIfVIP(boolean ifVIP) {
        this.ifVIP = ifVIP;
        if (ifVIP == true) {//防止同时满足的冲突
            ifAreaLimit = false;
            ifAllocat = false;
        }
    }

    public int getDiscountClazz() {
        return discountClazz;
    }

    public void setDiscountClazz(int discountClazz) {
        this.discountClazz = discountClazz;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public boolean isIfAreaLimit() {
        return ifAreaLimit;
    }

    public void setIfAreaLimit(boolean ifAreaLimit) {

        this.ifAreaLimit = ifAreaLimit;
        if (ifAreaLimit == true) {
            ifVIP = false;
            ifAllocat = false;
        }
    }

    public boolean isIfAllocat() {
        return ifAllocat;
    }

    public void setIfAllocat(boolean ifAllocat) {
        this.ifAllocat = ifAllocat;
        if (ifAllocat == true) {
            ifVIP = false;
            ifAreaLimit = false;
        }
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
