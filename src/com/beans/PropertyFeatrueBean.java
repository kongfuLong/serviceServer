package com.beans;

/**
 * Created by rcl on 2015/8/20.
 */
public class PropertyFeatrueBean {

    private String is_image;
    private String attr_image;
    private String attr_id;
    private String attr_value;
    private String attr_hashcode;
    private String attr_content;

    public PropertyFeatrueBean() {

    }

    public PropertyFeatrueBean(String attr_image, String is_image, String attr_id, String attr_value, String attr_hashcode, String attr_content) {
        this.is_image = is_image;
        this.attr_id = attr_id;
        this.attr_value = attr_value;
        this.attr_hashcode = attr_hashcode;
        this.attr_content = attr_content;
        this.attr_image = attr_image;
    }

    public String getAttr_image() {
        return attr_image;
    }

    public void setAttr_image(String attr_image) {
        this.attr_image = attr_image;
    }

    public String getIs_image() {
        return is_image;
    }

    public void setIs_image(String is_image) {
        this.is_image = is_image;
    }

    public String getAttr_id() {
        return attr_id;
    }

    public void setAttr_id(String attr_id) {
        this.attr_id = attr_id;
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

    public String getAttr_content() {
        return attr_content;
    }

    public void setAttr_content(String attr_content) {
        this.attr_content = attr_content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PropertyFeatrueBean)) return false;

        PropertyFeatrueBean that = (PropertyFeatrueBean) o;

        if (attr_hashcode != null ? !attr_hashcode.equals(that.attr_hashcode) : that.attr_hashcode != null)
            return false;
        if (attr_id != null ? !attr_id.equals(that.attr_id) : that.attr_id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attr_id != null ? attr_id.hashCode() : 0;
        result = 31 * result + (attr_hashcode != null ? attr_hashcode.hashCode() : 0);
        return result;
    }
}
