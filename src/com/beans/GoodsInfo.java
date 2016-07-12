package com.beans;

import com.services.tools.CheckTools;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rcl on 2015/8/8.
 * 产品详情bean
 * 包含了所有产品信息
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class GoodsInfo extends GoodsBaseInfo {

    //根据不同业务需求来使用的属性
    public List<GoodsPropertyBean> goodsPropertyBeans = new ArrayList<GoodsPropertyBean>();
    public Integer privilege = 0;
    public Integer vip = 0;//平台会员
    public String goods_num = "1";
    public String sale_price = "0";//当前价
    public Double amounts = 0.0;
    public Double fee_rate = 0.999;//服务费率
    public Integer price_clazz = 3;//当前价id
    public String car_property = "未选择车辆";
    public String property_code;
    public String property_json;
    public String property_ids;
    public String price_name = "平台价";//价格类型
    public Integer shop_clazz =1;//店铺优惠方式
    public Boolean fee_free_flag = false;//全免服务费开关
    public Double fee_free = 0.0;//服务费
    public String cart_uuid = "";//购物车id
    public List<GoodsBaseInfo> listGoodsInfo = null;//套餐相关
    public String tem_num = "0";//临时数量 为了同产品不同销售属性设置价格用
    //税费
    public Double s_tax_fee = 0.0;
    public Double c_tax_fee = 0.0;

    //public ConditionBean conditionBean;


    public GoodsInfo(){
    }


    public Double getS_tax_fee() {
        return s_tax_fee;
    }

    public void setS_tax_fee(Double s_tax_fee) {
        this.s_tax_fee = s_tax_fee;
    }

    public Double getC_tax_fee() {
        return c_tax_fee;
    }

    public void setC_tax_fee(Double c_tax_fee) {
        this.c_tax_fee = c_tax_fee;
    }

    public String getProperty_ids() {
        return property_ids;
    }

    public void setProperty_ids(String property_ids) {
        this.property_ids = property_ids;
    }

    public List<GoodsBaseInfo> getListGoodsInfo() {
        return listGoodsInfo;
    }

    public void setListGoodsInfo(List<GoodsBaseInfo> listGoodsInfo) {
        this.listGoodsInfo = listGoodsInfo;
    }

    public void addGoodsInfo(GoodsInfo goods) {
        if(listGoodsInfo==null){
            listGoodsInfo = new ArrayList<GoodsBaseInfo>();
        }
        listGoodsInfo.add(goods);
    }

    public String getTem_num() {
        return tem_num;
    }

    public void setTem_num(String tem_num) {
        this.tem_num = tem_num;
    }

    public String getCart_uuid() {
        return cart_uuid;
    }

    public void setCart_uuid(String cart_uuid) {
        this.cart_uuid = cart_uuid;
    }

    public void setFee_free_flag(boolean fee_free_flag) {
        this.fee_free_flag = fee_free_flag;
    }

    public Boolean getFee_free_flag() {
        return fee_free_flag;
    }

    public double getFee_free() {
        return fee_free;
    }

    public void setFee_free(double fee_free) {
        this.fee_free = fee_free;

    }
    public void setFee_free_All() {

        if(fee_free_flag){
            fee_free = fee_rate*amounts/100;
        }
    }

    public double getFee_rate() {
        return fee_rate;
    }

    public void setFee_rate(double fee_rate) {
        this.fee_rate = fee_rate;
        setFee_free_All();//设置费率时候触发
    }

    public List<GoodsPropertyBean> getGoodsPropertyBeans() {
        return goodsPropertyBeans;
    }

    public void setGoodsPropertyBeans(List<GoodsPropertyBean> goodsPropertyBeans) {
        this.goodsPropertyBeans = goodsPropertyBeans;
    }

    public int getShop_clazz() {
        return shop_clazz;
    }

    public void setShop_clazz(int shop_clazz) {
        this.shop_clazz = shop_clazz;
    }



    public String getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(String goods_num) {
        this.goods_num = goods_num;
    }

    public double getAmounts() {
        return amounts;
    }

    public void setAmounts(double amounts) {

        this.amounts = amounts;
    }

    public int getPrice_clazz() {
        return price_clazz;
    }

    public void setPrice_clazz(int price_clazz) {
        if(CheckTools.isNull(price_name)){
            if(price_clazz==3){
                price_name = "平台价";
            }else if(price_clazz==4){
                price_name = "经销价";
            }else if(price_clazz==5){
                price_name = "批发价";
            }
        }
        this.price_clazz = price_clazz;
    }

    public String getCar_property() {
        return car_property;
    }

    public void setCar_property(String car_property) {
        this.car_property = car_property;
    }

    public String getPrice_name() {
        return price_name;
    }

    public void setPrice_name(String price_name) {
        this.price_name = price_name;
    }

    /* public ConditionBean getConditionBean() {
        return conditionBean;
    }

    public void setConditionBean(ConditionBean conditionBean) {
        this.conditionBean = conditionBean;
    }*/


    public String getProperty_code() {
        return property_code;
    }

    public void setProperty_code(String property_code) {
        this.property_code = property_code;
    }

    public String getProperty_json() {
        return property_json;
    }

    public void setProperty_json(String property_json) {
        this.property_json = property_json;
    }



    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getPrivilege() {
        return privilege;
    }

    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }


}
