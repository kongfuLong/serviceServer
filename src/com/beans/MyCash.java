package com.beans;


/**
 * Created by rcl on 2015/11/14.
 */
public class MyCash {

    private String cash_id;
    private String cash_sn;
    private String seller_id;
    private String cash_title;
    private String cash_sub_title;
    private Integer coupon_money;
    private Integer min_money;
    private String use_start;
    private String use_end;
    private String buyer_id;
    private String start_time;
    private Integer is_used;
    private String order_id;
    private String used_time;

    public MyCash() {
    }

    public String getCash_id() {
        return cash_id;
    }

    public void setCash_id(String cash_id) {
        this.cash_id = cash_id;
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

    public String getUsed_time() {
        return used_time;
    }

    public void setUsed_time(String used_time) {
        this.used_time = used_time;
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

    public Integer getCoupon_money() {
        return coupon_money;
    }

    public void setCoupon_money(Integer coupon_money) {
        this.coupon_money = coupon_money;
    }

    public Integer getMin_money() {
        return min_money;
    }

    public void setMin_money(Integer min_money) {
        this.min_money = min_money;
    }



    public String getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(String buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public Integer getIs_used() {
        return is_used;
    }

    public void setIs_used(Integer is_used) {
        this.is_used = is_used;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }


}
