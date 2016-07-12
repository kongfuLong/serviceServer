package com.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rcl on 2015/8/15.
 */
public class CarBrandBean {

    private String brand_id;
    private String brand_name;
    private String brand_english;
    private String brand_py;
    private String brand_ower;
    private String brand_sp;
    private String brand_manufacturer;
    private String m_code;
    private String brand_logo;
    private int is_lock;
    private int is_nav;
    private String sort_field;
    private String sort_weight;
    private String seo_key;
    private String seo_desc;

    //扩展属性
    private List<CarModelBean> carModelBeans = new ArrayList<CarModelBean>();

    public CarBrandBean() {

    }



    public boolean ifMyModelBean(CarModelBean carModelBean) {
        if (brand_id.equals(carModelBean.getBrand_id())) {
            addModelBean(carModelBean);
            return true;
        } else {
            return false;
        }
    }

    public void addModelBean(CarModelBean carModelBean) {
        carModelBeans.add(carModelBean);
    }

    public List<CarModelBean> getCarModelBeans() {
        return carModelBeans;
    }

    public void setCarModelBeans(List<CarModelBean> carModelBeans) {
        this.carModelBeans = carModelBeans;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_english() {
        return brand_english;
    }

    public void setBrand_english(String brand_english) {
        this.brand_english = brand_english;
    }

    public String getBrand_py() {
        return brand_py;
    }

    public void setBrand_py(String brand_py) {
        this.brand_py = brand_py;
    }

    public String getBrand_ower() {
        return brand_ower;
    }

    public void setBrand_ower(String brand_ower) {
        this.brand_ower = brand_ower;
    }

    public String getBrand_sp() {
        return brand_sp;
    }

    public void setBrand_sp(String brand_sp) {
        this.brand_sp = brand_sp;
    }

    public String getBrand_manufacturer() {
        return brand_manufacturer;
    }

    public void setBrand_manufacturer(String brand_manufacturer) {
        this.brand_manufacturer = brand_manufacturer;
    }

    public String getM_code() {
        return m_code;
    }

    public void setM_code(String m_code) {
        this.m_code = m_code;
    }

    public String getBrand_logo() {
        return brand_logo;
    }

    public void setBrand_logo(String brand_logo) {
        this.brand_logo = brand_logo;
    }

    public int getIs_lock() {
        return is_lock;
    }

    public void setIs_lock(int is_lock) {
        this.is_lock = is_lock;
    }

    public int getIs_nav() {
        return is_nav;
    }

    public void setIs_nav(int is_nav) {
        this.is_nav = is_nav;
    }

    public String getSort_field() {
        return sort_field;
    }

    public void setSort_field(String sort_field) {
        this.sort_field = sort_field;
    }

    public String getSort_weight() {
        return sort_weight;
    }

    public void setSort_weight(String sort_weight) {
        this.sort_weight = sort_weight;
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


}
