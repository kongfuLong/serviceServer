package com.beans;

/**
 * Created by rcl on 2015/8/27.
 */
public class AcCouponBean {

    private String active_id;
    private Integer is_presale;
    private String active_name;
    private String user_clazz = "0";
    private String user_rank;
    private String user_id;
    private Integer active_clazz = 100;
    private String goods_ids;
    private String price_mark;
    private String f_condition;
    private String s_condition;
    private String t_condition;
    private String start_time = "0";
    private String end_time;
    private String pay_deposit;
    private Integer biz_clazz = 1;


    public AcCouponBean() {
    }


    public String getT_condition() {
        return t_condition;
    }

    public void setT_condition(String t_condition) {
        this.t_condition = t_condition;
    }

    public int getBiz_clazz() {
        return biz_clazz;
    }

    public void setBiz_clazz(int biz_clazz) {
        this.biz_clazz = biz_clazz;
    }

    public String getActive_id() {
        return active_id;
    }

    public void setActive_id(String active_id) {
        this.active_id = active_id;
    }

    public int getIs_presale() {
        return is_presale;
    }

    public void setIs_presale(int is_presale) {
        this.is_presale = is_presale;
    }

    public String getActive_name() {
        return active_name;
    }

    public void setActive_name(String active_name) {
        this.active_name = active_name;
    }

    public String getUser_clazz() {
        return user_clazz;
    }

    public void setUser_clazz(String user_clazz) {
        this.user_clazz = user_clazz;
    }

    public String getUser_rank() {
        return user_rank;
    }

    public void setUser_rank(String user_rank) {
        this.user_rank = user_rank;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getActive_clazz() {
        return active_clazz;
    }

    public void setActive_clazz(int active_clazz) {
        this.active_clazz = active_clazz;
    }

    public String getGoods_ids() {
        return goods_ids;
    }

    public void setGoods_ids(String goods_ids) {
        this.goods_ids = goods_ids;
    }

    public String getPrice_mark() {
        return price_mark;
    }

    public void setPrice_mark(String price_mark) {
        this.price_mark = price_mark;
    }

    public String getF_condition() {
        return f_condition;
    }

    public void setF_condition(String f_condition) {
        this.f_condition = f_condition;
    }

    public String getS_condition() {
        return s_condition;
    }

    public void setS_condition(String s_condition) {
        this.s_condition = s_condition;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getPay_deposit() {
        return pay_deposit;
    }

    public void setPay_deposit(String pay_deposit) {
        this.pay_deposit = pay_deposit;
    }
}
