package com.beans;

/**
 * Created by rcl on 2015/9/8.
 */
public abstract class OrderInfo {
    private String order_id;
    private String order_time;
    private String user_id;
    private String refer_ip;
    private Integer country_id = 23;
    private String province_id = "0";
    private String city_id = "0";
    private String area_id = "0";
    private Integer is_anony = 0;
    private Integer is_invoice = 0;
    private String invoice_id = "0";
    private Integer invoice_type = -1;//默认不开票
    private String phone = "";
    private String address = "";
    private String receiver = "";
    private String order_refer = "1";//0电脑站 1手机站
    private Integer biz_clazz = 1;
    private Integer orderType = 1;//订单类型1普通2保养3换胎4洗车99活动
    private String active_id = "0";//0为非活动订单
    private String is_replace_receiver = "0";//是否代收货
    private String cash_sn;//红包编号
    private String card_sn;//优惠券编号
    private String cash_id;//我的红包编号  主键
    private boolean isbooking = false;//是否预约单
    private String appointment_time;//预约时间

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {


        this.appointment_time = appointment_time;
    }


    protected OrderInfo() {
    }

    public boolean isIsbooking() {
        return isbooking;
    }

    public void setIsbooking(boolean isbooking) {
        this.isbooking = isbooking;
    }

    public String getCash_sn() {
        return cash_sn;
    }



    public String getCash_id() {
        return cash_id;
    }

    public void setCash_id(String cash_id) {
        this.cash_id = cash_id;
    }

    public void setCash_sn(String cash_sn) {
        this.cash_sn = cash_sn;
    }

    public String getCard_sn() {
        return card_sn;
    }

    public void setCard_sn(String card_sn) {
        this.card_sn = card_sn;
    }

    public String getIs_replace_receiver() {
        return is_replace_receiver;
    }

    public void setIs_replace_receiver(String is_replace_receiver) {
        this.is_replace_receiver = is_replace_receiver;
    }

    public String getActive_id() {
        return active_id;
    }

    public void setActive_id(String active_id) {
        this.active_id = active_id;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public int getInvoice_type() {
        return invoice_type;
    }

    public void setInvoice_type(int invoice_type) {
        this.invoice_type = invoice_type;
    }

    public int getIs_anony() {
        return is_anony;
    }

    public void setIs_anony(int is_anony) {
        this.is_anony = is_anony;
    }

    public int getIs_invoice() {
        return is_invoice;
    }

    public void setIs_invoice(int is_invoice) {
        this.is_invoice = is_invoice;
    }

    public String getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(String invoice_id) {
        this.invoice_id = invoice_id;
    }

    public int getBiz_clazz() {
        return biz_clazz;
    }

    public void setBiz_clazz(int biz_clazz) {
        this.biz_clazz = biz_clazz;
    }

    public String getOrder_refer() {
        return order_refer;
    }

    public void setOrder_refer(String order_refer) {
        this.order_refer = order_refer;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
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

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
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

    public String getRefer_ip() {
        return refer_ip;
    }

    public void setRefer_ip(String refer_ip) {
        this.refer_ip = refer_ip;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
