package com.beans;

/**
 * Created by rcl on 2015/12/2.
 */
public class CashCoupon {

    private String cash_sn;
    private String seller_id;
    private String cash_title;
    private String cash_sub_title;
    private String give_start;
    private String give_end;
    private String use_start = "0";
    private String use_end = "0";
    private String opened;
    private String used_nums;
    private String coupon_money;
    private String min_money;
    private String total_nums;
    private String use_clazz;//0 1

    public CashCoupon() {
    }

    public String getUse_clazz() {
        return use_clazz;
    }

    public void setUse_clazz(String use_clazz) {
        this.use_clazz = use_clazz;
    }

    public String getCash_sn() {
        return cash_sn;
    }

    public void setCash_sn(String cash_sn) {
        this.cash_sn = cash_sn;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getCash_title() {
        return cash_title;
    }

    public void setCash_title(String cash_title) {
        this.cash_title = cash_title;
    }

    public String getCash_sub_title() {
        return cash_sub_title;
    }

    public void setCash_sub_title(String cash_sub_title) {
        this.cash_sub_title = cash_sub_title;
    }

    public String getGive_start() {
        return give_start;
    }

    public void setGive_start(String give_start) {
        this.give_start = give_start;
    }

    public String getGive_end() {
        return give_end;
    }

    public void setGive_end(String give_end) {
        this.give_end = give_end;
    }

    public String getUse_start() {
        return use_start;
    }

    public void setUse_start(String use_start) {
        this.use_start = use_start;
    }

    public String getUse_end() {
        return use_end;
    }

    public void setUse_end(String use_end) {
        this.use_end = use_end;
    }

    public String getOpened() {
        return opened;
    }

    public void setOpened(String opened) {
        this.opened = opened;
    }

    public String getUsed_nums() {
        return used_nums;
    }

    public void setUsed_nums(String used_nums) {
        this.used_nums = used_nums;
    }

    public String getCoupon_money() {
        return coupon_money;
    }

    public void setCoupon_money(String coupon_money) {
        this.coupon_money = coupon_money;
    }

    public String getMin_money() {
        return min_money;
    }

    public void setMin_money(String min_money) {
        this.min_money = min_money;
    }

    public String getTotal_nums() {
        return total_nums;
    }

    public void setTotal_nums(String total_nums) {
        this.total_nums = total_nums;
    }
}
