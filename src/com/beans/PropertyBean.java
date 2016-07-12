package com.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rcl on 2015/8/20.
 */
public class PropertyBean {

    private String attr_id;
    private String model_attr_id;
    private String attr_name;
    private String attr_type_input;
    private String attr_sort;
    private String attr_value;
    private String attr_hashcode;
    private String enabled;
    private String is_sell;

    private Set<PropertyFeatrueBean> propertyFeatrueBeans = new HashSet<PropertyFeatrueBean>();

    public PropertyBean() {

    }

    public PropertyBean(String attr_id, String model_attr_id, String attr_name, String attr_type_input, String attr_sort, String attr_value, String attr_hashcode, String enabled, String is_sell) {
        this.attr_id = attr_id;
        this.model_attr_id = model_attr_id;
        this.attr_name = attr_name;
        this.attr_type_input = attr_type_input;
        this.attr_sort = attr_sort;
        this.attr_value = attr_value;
        this.attr_hashcode = attr_hashcode;
        this.enabled = enabled;
        this.is_sell = is_sell;
    }

    public void addPropertyFeatrueBean(PropertyFeatrueBean propertyFeatrueBean) {
        if (!propertyFeatrueBeans.contains(propertyFeatrueBean) && propertyFeatrueBean.getAttr_id().equals(attr_id)) {
            propertyFeatrueBeans.add(propertyFeatrueBean);
        }
    }

    public Set<PropertyFeatrueBean> getPropertyFeatrueBeans() {
        return propertyFeatrueBeans;
    }

    public void setPropertyFeatrueBeans(Set<PropertyFeatrueBean> propertyFeatrueBeans) {
        this.propertyFeatrueBeans = propertyFeatrueBeans;
    }

    public String getAttr_id() {
        return attr_id;
    }

    public void setAttr_id(String attr_id) {
        this.attr_id = attr_id;
    }

    public String getModel_attr_id() {
        return model_attr_id;
    }

    public void setModel_attr_id(String model_attr_id) {
        this.model_attr_id = model_attr_id;
    }

    public String getAttr_name() {
        return attr_name;
    }

    public void setAttr_name(String attr_name) {
        this.attr_name = attr_name;
    }

    public String getAttr_type_input() {
        return attr_type_input;
    }

    public void setAttr_type_input(String attr_type_input) {
        this.attr_type_input = attr_type_input;
    }

    public String getAttr_sort() {
        return attr_sort;
    }

    public void setAttr_sort(String attr_sort) {
        this.attr_sort = attr_sort;
    }

    public String getAttr_value() {
        return attr_value;
    }

    public void setAttr_value(String attr_value) {
        this.attr_value = attr_value;
    }

    public String getAttr_hashcode() {
        return attr_hashcode;
    }

    public void setAttr_hashcode(String attr_hashcode) {
        this.attr_hashcode = attr_hashcode;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getIs_sell() {
        return is_sell;
    }

    public void setIs_sell(String is_sell) {
        this.is_sell = is_sell;
    }
}
