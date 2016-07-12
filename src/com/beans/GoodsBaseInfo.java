package com.beans;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by rcl on 2015/9/7.
 */
public  class GoodsBaseInfo implements Serializable {

    //基础属性
    public String goods_id;
    public Integer biz_clazz = 1;//1普通产品2工时产品3保养套餐4产品套餐
    public String user_id;
    public String brand_ids;
    public String car_model_ids;
    public String car_conf_ids;
    public String original_car_no;
    public String parts_cate_id;
    public String parts_brand_id;
    public String is_oem;
    public String is_dead;
    public String is_sale_property;
    public String sale_limit;
    public String goodsName;
    public String goods_name_sp;
    public String goods_name_py;
    public String goods_sell_title;
    public String mfg_no;
    public String rank;
    public String goods_no;
    public String goods_sn;
    public String goods_standard;
    public String unit_name;
    public String weight = "0";
    public String volume = "0";
    public String goods_main_img = "/images/pro_pic.png";
    public String goods_imgs = "/images/pro_pic.png";
    public Date price_life;
    public Integer is_tax =1;
    public Double c_tax_rate = 0.0;
    public Double s_tax_rate = 0.0;
    public String price0 ="0";
    public String price1 ="0";
    public String price2 ="0";
    public String price3 ="0";
    public String price4 ="0";
    public String price5 ="0";
    public int min_num_3 = 0;
    public int min_num_4 = 0;
    public int min_num_5 = 0;
    public int store_num = 0;
    public String remark;
    public String freight_id;
    public String sort_weight;
    public String sell_start_time;
    public String sell_end_time;
    public int is_lock = 0;
    public String add_time;
    public String update_time;
    public String seo_key;
    public String seo_desc;
    public int snap_status = 0;
    public String snapshot;
    public int is_presale = 0;//预付
    public String pay_deposit;//预付款
    public int active_clazz = 0;



    public int getActive_clazz() {
        return active_clazz;
    }

    public void setActive_clazz(int active_clazz) {
        this.active_clazz = active_clazz;
    }

    public int getIs_presale() {
        return is_presale;
    }

    public void setIs_presale(int is_presale) {
        this.is_presale = is_presale;
    }

    public String getPay_deposit() {
        return pay_deposit;
    }

    public void setPay_deposit(String pay_deposit) {
        this.pay_deposit = pay_deposit;
    }

    public int getBiz_clazz() {
        return biz_clazz;
    }

    public void setBiz_clazz(int biz_clazz) {
        this.biz_clazz = biz_clazz;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBrand_ids() {
        return brand_ids;
    }

    public void setBrand_ids(String brand_ids) {
        this.brand_ids = brand_ids;
    }

    public String getCar_model_ids() {
        return car_model_ids;
    }

    public void setCar_model_ids(String car_model_ids) {
        this.car_model_ids = car_model_ids;
    }

    public String getCar_conf_ids() {
        return car_conf_ids;
    }

    public void setCar_conf_ids(String car_conf_ids) {
        this.car_conf_ids = car_conf_ids;
    }

    public String getOriginal_car_no() {
        return original_car_no;
    }

    public void setOriginal_car_no(String original_car_no) {
        this.original_car_no = original_car_no;
    }

    public String getParts_cate_id() {
        return parts_cate_id;
    }

    public void setParts_cate_id(String parts_cate_id) {
        this.parts_cate_id = parts_cate_id;
    }

    public String getParts_brand_id() {
        return parts_brand_id;
    }

    public void setParts_brand_id(String parts_brand_id) {
        this.parts_brand_id = parts_brand_id;
    }

    public String getIs_oem() {
        return is_oem;
    }

    public void setIs_oem(String is_oem) {
        this.is_oem = is_oem;
    }

    public String getIs_dead() {
        return is_dead;
    }

    public void setIs_dead(String is_dead) {
        this.is_dead = is_dead;
    }

    public String getIs_sale_property() {
        return is_sale_property;
    }

    public void setIs_sale_property(String is_sale_property) {
        this.is_sale_property = is_sale_property;
    }

    public String getSale_limit() {
        return sale_limit;
    }

    public void setSale_limit(String sale_limit) {
        this.sale_limit = sale_limit;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoods_name_sp() {
        return goods_name_sp;
    }

    public void setGoods_name_sp(String goods_name_sp) {
        this.goods_name_sp = goods_name_sp;
    }

    public String getGoods_name_py() {
        return goods_name_py;
    }

    public void setGoods_name_py(String goods_name_py) {
        this.goods_name_py = goods_name_py;
    }

    public String getGoods_sell_title() {
        return goods_sell_title;
    }

    public void setGoods_sell_title(String goods_sell_title) {
        this.goods_sell_title = goods_sell_title;
    }

    public String getMfg_no() {
        return mfg_no;
    }

    public void setMfg_no(String mfg_no) {
        this.mfg_no = mfg_no;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getGoods_no() {
        return goods_no;
    }

    public void setGoods_no(String goods_no) {
        this.goods_no = goods_no;
    }

    public String getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(String goods_sn) {
        this.goods_sn = goods_sn;
    }

    public String getGoods_standard() {
        return goods_standard;
    }

    public void setGoods_standard(String goods_standard) {
        this.goods_standard = goods_standard;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getGoods_main_img() {
        return goods_main_img;
    }

    public void setGoods_main_img(String goods_main_img) {
        this.goods_main_img = goods_main_img;
    }

    public String getGoods_imgs() {
        return goods_imgs;
    }

    public void setGoods_imgs(String goods_imgs) {
        this.goods_imgs = goods_imgs;
    }

    public Date getPrice_life() {
        return price_life;
    }

    public void setPrice_life(Date price_life) {
        this.price_life = price_life;
    }

    public int getIs_tax() {
        return is_tax;
    }

    public void setIs_tax(int is_tax) {
        this.is_tax = is_tax;
    }

    public double getC_tax_rate() {
        return c_tax_rate;
    }

    public void setC_tax_rate(double c_tax_rate) {
        this.c_tax_rate = c_tax_rate;
    }

    public double getS_tax_rate() {
        return s_tax_rate;
    }

    public void setS_tax_rate(double s_tax_rate) {
        this.s_tax_rate = s_tax_rate;
    }

    public String getPrice0() {
        return price0;
    }

    public void setPrice0(String price0) {
        this.price0 = price0;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    public String getPrice3() {
        return price3;
    }

    public void setPrice3(String price3) {
        this.price3 = price3;
    }

    public String getPrice4() {
        return price4;
    }

    public void setPrice4(String price4) {
        this.price4 = price4;
    }

    public String getPrice5() {
        return price5;
    }

    public void setPrice5(String price5) {
        this.price5 = price5;
    }

    public int getMin_num_3() {
        return min_num_3;
    }

    public void setMin_num_3(int min_num_3) {
        this.min_num_3 = min_num_3;
    }

    public int getMin_num_4() {
        return min_num_4;
    }

    public void setMin_num_4(int min_num_4) {
        this.min_num_4 = min_num_4;
    }

    public int getMin_num_5() {
        return min_num_5;
    }

    public void setMin_num_5(int min_num_5) {
        this.min_num_5 = min_num_5;
    }

    public int getStore_num() {
        return store_num;
    }

    public void setStore_num(int store_num) {
        this.store_num = store_num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFreight_id() {
        return freight_id;
    }

    public void setFreight_id(String freight_id) {
        this.freight_id = freight_id;
    }

    public String getSort_weight() {
        return sort_weight;
    }

    public void setSort_weight(String sort_weight) {
        this.sort_weight = sort_weight;
    }

    public String getSell_start_time() {
        return sell_start_time;
    }

    public void setSell_start_time(String sell_start_time) {
        this.sell_start_time = sell_start_time;
    }

    public String getSell_end_time() {
        return sell_end_time;
    }

    public void setSell_end_time(String sell_end_time) {
        this.sell_end_time = sell_end_time;
    }

    public int getIs_lock() {
        return is_lock;
    }

    public void setIs_lock(int is_lock) {
        this.is_lock = is_lock;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getSeo_key() {
        return seo_key;
    }

    public void setSeo_key(String seo_key) {
        this.seo_key = seo_key;
    }

    public String getSeo_desc() {
        return seo_desc;
    }

    public void setSeo_desc(String seo_desc) {
        this.seo_desc = seo_desc;
    }

    public int getSnap_status() {
        return snap_status;
    }

    public void setSnap_status(int snap_status) {
        this.snap_status = snap_status;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }
}
