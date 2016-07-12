package com.beans;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by rcl on 2015/12/24.
 *
 *  order_id             bigint unsigned not null comment '使用年月日+当日8位订单序号号如2014101000000001',
 order_status         tinyint comment '0等待付款 1交易完成 2交易关闭',
 user_id              bigint unsigned,
 order_time           datetime,
 order_refer          tinyint default 0 comment '0电脑1手机',
 refer_web            varchar(120),
 refer_ip             bigint,
 biz_proposal_no      varchar(64),
 biz_total_premium    decimal(7,2),
 force_proposal_no    varchar(64),
 force_total_premium  decimal(7,2),
 vehicle_tax_premium  decimal(7,2),
 order_amount         decimal(8,2),
 pay_type             tinyint default 3 comment '0平台支付1货到付款2POS支付3第三方支付',
 owner_name           varchar(30),
 owner_mobile         varchar(30),
 ower_idcard          char(17),
 vehicle_frame_no     char(17),
 vehicle_model_name   varchar(60),
 engine_no            varchar(20),
 register_date        date,
 special_car_flag     tinyint default 0,
 special_car_date     date,
 province_id          int,
 city_id              int,
 area_id              int,
 address_info         varchar(60),
 proposal_datagram    varchar(2000),
 back_time            datetime,
 real_amounts         decimal(10,2),
 pay_time             datetime,
 biz_policy_no        varchar(64),
 biz_start_date       date,
 biz_end_date         date,
 force_policy_no      varchar(64),
 force_start_date     date,
 force_end_date       date,
 back_datagram        varchar(2000),
 primary key (order_id)

 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class InsuranceOrder {

    private String order_id;
    private Integer order_status;
    private String user_id;
    private String order_time;
    private Integer order_refer = 1;
    private String refer_web;
    private String refer_ip;
    private String biz_proposal_no;
    private Double biz_total_premium;
    private String force_proposal_no;
    private Double force_total_premium;
    private Double vehicle_tax_premium;
    private Double order_amount;
    private Integer pay_type = 2;
    private String owner_name;
    private String owner_mobile;
    private String ower_idcard;
    private String vehicle_frame_no;
    private String vehicle_model_name;
    private String engine_no;
    private String register_date;
    private Integer special_car_flag = 0;
    private String special_car_date;
    private Integer province_id;
    private Integer city_id;
    private Integer area_id;
    private String address_info;
    private String proposal_datagram;
    private String num_plate;
    private String receiver;
    private String phone;
    //回调后存储
    private String back_time;
    private Double real_amounts;
    private String pay_time;
    private String biz_policy_no;
    private String biz_start_date;
    private String biz_end_date;
    private String force_policy_no;
    private String force_start_date;
    private String force_end_date;
    private String back_datagram;
    //扩展字段不存数据库
    private String parameters;

    public InsuranceOrder() {
    }


    public String getNum_plate() {
        return num_plate;
    }

    public void setNum_plate(String num_plate) {
        this.num_plate = num_plate;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public Integer getOrder_refer() {
        return order_refer;
    }

    public void setOrder_refer(Integer order_refer) {
        this.order_refer = order_refer;
    }

    public String getRefer_web() {
        return refer_web;
    }

    public void setRefer_web(String refer_web) {
        this.refer_web = refer_web;
    }

    public String getRefer_ip() {
        return refer_ip;
    }

    public void setRefer_ip(String refer_ip) {
        this.refer_ip = refer_ip;
    }

    public String getBiz_proposal_no() {
        return biz_proposal_no;
    }

    public void setBiz_proposal_no(String biz_proposal_no) {
        this.biz_proposal_no = biz_proposal_no;
    }

    public Double getBiz_total_premium() {
        return biz_total_premium;
    }

    public void setBiz_total_premium(Double biz_total_premium) {
        this.biz_total_premium = biz_total_premium;
    }

    public String getForce_proposal_no() {
        return force_proposal_no;
    }

    public void setForce_proposal_no(String force_proposal_no) {
        this.force_proposal_no = force_proposal_no;
    }

    public Double getForce_total_premium() {
        return force_total_premium;
    }

    public void setForce_total_premium(Double force_total_premium) {
        this.force_total_premium = force_total_premium;
    }

    public Double getVehicle_tax_premium() {
        return vehicle_tax_premium;
    }

    public void setVehicle_tax_premium(Double vehicle_tax_premium) {
        this.vehicle_tax_premium = vehicle_tax_premium;
    }

    public Double getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(Double order_amount) {
        this.order_amount = order_amount;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getOwner_mobile() {
        return owner_mobile;
    }

    public void setOwner_mobile(String owner_mobile) {
        this.owner_mobile = owner_mobile;
    }

    public String getOwer_idcard() {
        return ower_idcard;
    }

    public void setOwer_idcard(String ower_idcard) {
        this.ower_idcard = ower_idcard;
    }

    public String getVehicle_frame_no() {
        return vehicle_frame_no;
    }

    public void setVehicle_frame_no(String vehicle_frame_no) {
        this.vehicle_frame_no = vehicle_frame_no;
    }

    public String getVehicle_model_name() {
        return vehicle_model_name;
    }

    public void setVehicle_model_name(String vehicle_model_name) {
        this.vehicle_model_name = vehicle_model_name;
    }

    public String getEngine_no() {
        return engine_no;
    }

    public void setEngine_no(String engine_no) {
        this.engine_no = engine_no;
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

    public Integer getSpecial_car_flag() {
        return special_car_flag;
    }

    public void setSpecial_car_flag(Integer special_car_flag) {
        this.special_car_flag = special_car_flag;
    }

    public String getSpecial_car_date() {
        return special_car_date;
    }

    public void setSpecial_car_date(String special_car_date) {
        this.special_car_date = special_car_date;
    }

    public Integer getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public String getAddress_info() {
        return address_info;
    }

    public void setAddress_info(String address_info) {
        this.address_info = address_info;
    }

    public String getProposal_datagram() {
        return proposal_datagram;
    }

    public void setProposal_datagram(String proposal_datagram) {
        this.proposal_datagram = proposal_datagram;
    }

    public String getBack_time() {
        return back_time;
    }

    public void setBack_time(String back_time) {
        this.back_time = back_time;
    }

    public Double getReal_amounts() {
        return real_amounts;
    }

    public void setReal_amounts(Double real_amounts) {
        this.real_amounts = real_amounts;
    }

    public String getPay_time() {
        return pay_time;
    }

    public void setPay_time(String pay_time) {
        this.pay_time = pay_time;
    }

    public String getBiz_policy_no() {
        return biz_policy_no;
    }

    public void setBiz_policy_no(String biz_policy_no) {
        this.biz_policy_no = biz_policy_no;
    }

    public String getBiz_start_date() {
        return biz_start_date;
    }

    public void setBiz_start_date(String biz_start_date) {
        this.biz_start_date = biz_start_date;
    }

    public String getBiz_end_date() {
        return biz_end_date;
    }

    public void setBiz_end_date(String biz_end_date) {
        this.biz_end_date = biz_end_date;
    }

    public String getForce_policy_no() {
        return force_policy_no;
    }

    public void setForce_policy_no(String force_policy_no) {
        this.force_policy_no = force_policy_no;
    }

    public String getForce_start_date() {
        return force_start_date;
    }

    public void setForce_start_date(String force_start_date) {
        this.force_start_date = force_start_date;
    }

    public String getForce_end_date() {
        return force_end_date;
    }

    public void setForce_end_date(String force_end_date) {
        this.force_end_date = force_end_date;
    }

    public String getBack_datagram() {
        return back_datagram;
    }

    public void setBack_datagram(String back_datagram) {
        this.back_datagram = back_datagram;
    }
}
