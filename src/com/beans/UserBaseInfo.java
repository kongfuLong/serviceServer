package com.beans;

/**
 * Created by rcl on 2015/8/27.
 */
public class UserBaseInfo {

    private String user_id;
    private String user_type;
    private String user_clazz;
    private String is_seller;
    private String login_name;
    private String login_pwd;
    private String login_salt;
    private String nick;
    private String last_time;
    private String last_ip;
    private String session_uuid;//验证登陆  同时也做自动登录用token
    private String valid_mobile;
    private String valid_email;
    private String idcard;
    private Integer allocate_on = 0;
    private String allocate_object = "";
    private String allocate_brand = "";
    private String area_id;
    private String shop_member="";
    private String v_member = "";
    private String others1;
    private String check_status = "0";
    private Double fee_rate = 0.00;
    private Integer is_lock = 0;
    private String province_id;
    private String city_id;
    private String default_car_id;
    //太多了没写完  用到再补充

    public UserBaseInfo(){

    }

    public String getDefault_car_id() {
        return default_car_id;
    }

    public void setDefault_car_id(String default_car_id) {
        this.default_car_id = default_car_id;
    }

    public String getOthers1() {
        return others1;
    }

    public void setOthers1(String others1) {
        this.others1 = others1;
    }

    public String getProvince_id() {
        return province_id;
    }

    public void setProvince_id(String province_id) {
        this.province_id = province_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public int getIs_lock() {
        return is_lock;
    }

    public void setIs_lock(int is_lock) {
        this.is_lock = is_lock;
    }

    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }

    public String getLast_ip() {
        return last_ip;
    }

    public void setLast_ip(String last_ip) {
        this.last_ip = last_ip;
    }

    public String getSession_uuid() {
        return session_uuid;
    }

    public void setSession_uuid(String session_uuid) {
        this.session_uuid = session_uuid;
    }

    public String getValid_mobile() {
        return valid_mobile;
    }

    public void setValid_mobile(String valid_mobile) {
        this.valid_mobile = valid_mobile;
    }

    public String getValid_email() {
        return valid_email;
    }

    public void setValid_email(String valid_email) {
        this.valid_email = valid_email;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public double getFee_rate() {
        return fee_rate;
    }

    public void setFee_rate(double fee_rate) {
        this.fee_rate = fee_rate;
    }

    public String getCheck_status() {
        return check_status;
    }

    public void setCheck_status(String check_status) {
        this.check_status = check_status;
    }

    public String getV_member() {
        return v_member;
    }

    public void setV_member(String v_member) {
        this.v_member = v_member;
    }

    public String getShop_member() {
        return shop_member;
    }

    public void setShop_member(String shop_member) {
        this.shop_member = shop_member;
    }

    public String getAllocate_brand() {
        return allocate_brand;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public void setAllocate_brand(String allocate_brand) {
        this.allocate_brand = allocate_brand;
    }

    public String getAllocate_object() {
        return allocate_object;
    }

    public void setAllocate_object(String allocate_object) {
        this.allocate_object = allocate_object;
    }

    public int getAllocate_on() {
        return allocate_on;
    }

    public void setAllocate_on(int allocate_on) {
        this.allocate_on = allocate_on;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_clazz() {
        return user_clazz;
    }

    public void setUser_clazz(String user_clazz) {
        this.user_clazz = user_clazz;
    }

    public String getIs_seller() {
        return is_seller;
    }

    public void setIs_seller(String is_seller) {
        this.is_seller = is_seller;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getLogin_pwd() {
        return login_pwd;
    }

    public void setLogin_pwd(String login_pwd) {
        this.login_pwd = login_pwd;
    }

    public String getLogin_salt() {
        return login_salt;
    }

    public void setLogin_salt(String login_salt) {
        this.login_salt = login_salt;
    }
}
