package com.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rcl on 2015/8/15.
 */
public class CarModelBean {

    private String car_model_id;
    private String brand_id;
    private String car_model_name;
    private String car_model_english;
    private String car_model_py;
    private String car_model_no;
    private int is_lock;
    private int is_nav;
    private String sort_field;
    private String sort_weight;
    private String seo_key;
    private String seo_desc;


    //扩展属性
    private List<CarConfBean> carConfBeans = new ArrayList<CarConfBean>();

    public CarModelBean() {
    }



    public boolean ifMyConfBean(CarConfBean carConfBean) {
        if (carConfBean.getCar_model_id().equals(car_model_id)) {
            addConfBean(carConfBean);
            return true;
        } else {
            return false;
        }
    }

    public void addConfBean(CarConfBean carConfBean) {
        carConfBeans.add(carConfBean);
    }

    public List<CarConfBean> getCarConfBeans() {
        return carConfBeans;
    }

    public void setCarConfBeans(List<CarConfBean> carConfBeans) {
        this.carConfBeans = carConfBeans;
    }

    public String getCar_model_id() {
        return car_model_id;
    }

    public void setCar_model_id(String car_model_id) {
        this.car_model_id = car_model_id;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getCar_model_name() {
        return car_model_name;
    }

    public void setCar_model_name(String car_model_name) {
        this.car_model_name = car_model_name;
    }

    public String getCar_model_english() {
        return car_model_english;
    }

    public void setCar_model_english(String car_model_english) {
        this.car_model_english = car_model_english;
    }

    public String getCar_model_py() {
        return car_model_py;
    }

    public void setCar_model_py(String car_model_py) {
        this.car_model_py = car_model_py;
    }

    public String getCar_model_no() {
        return car_model_no;
    }

    public void setCar_model_no(String car_model_no) {
        this.car_model_no = car_model_no;
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
