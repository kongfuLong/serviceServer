package com.beans;


import java.io.Serializable;

/**
 * Created by hty070503 on 2014/12/5.
 * 订单产品bean
 */
public class GoodsBean extends GoodsInfo implements Serializable {
    private String order_id;
    private String order_item = "1";
    private String user_id_buyer;
    private String order_time;
    private Integer credits = 0;
    private String is_discount = "0";
    private String originalPrice;//不含税价格
    private Integer group_id = 1;
    private String discount_price = "0.00";
    private String promotion_id = "0";
    private Double cost_amounts = 0.00;
    private Double profit_amounts = 0.00;
    private Integer invoice_type = 0;//0不开票 1增值税专用2增值税普通
    private Double tax = 0.0;//方案一 0不开票1价格已含税  (>1)其他 税率   方案二 实收税点
    private Double tax_amount = 0.00;
    private String father_user_id;//默认为user_id
    private boolean ifDB = true;//标识是否插入数据库
    private boolean ifCalculate = true;//标识是否参与订单计算

    public boolean isIfCalculate() {
        return ifCalculate;
    }

    public void setIfCalculate(boolean ifCalculate) {
        this.ifCalculate = ifCalculate;
    }

    public boolean isIfDB() {
        return ifDB;
    }

    public void setIfDB(boolean ifDB) {
        this.ifDB = ifDB;
    }

    public GoodsBean() {
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }


    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_item() {
        return order_item;
    }

    public void setOrder_item(String order_item) {
        this.order_item = order_item;
    }


    public String getUser_id_buyer() {
        return user_id_buyer;
    }

    public void setUser_id_buyer(String user_id_buyer) {
        this.user_id_buyer = user_id_buyer;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getIs_discount() {
        return is_discount;
    }

    public void setIs_discount(String is_discount) {
        this.is_discount = is_discount;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(String discount_price) {
        this.discount_price = discount_price;
    }

    public String getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(String promotion_id) {
        this.promotion_id = promotion_id;
    }

    public double getCost_amounts() {
        return cost_amounts;
    }

    public void setCost_amounts(double cost_amounts) {
        this.cost_amounts = cost_amounts;
    }



    public double getProfit_amounts() {
        return profit_amounts;
    }

    public void setProfit_amounts(double profit_amounts) {
        this.profit_amounts = profit_amounts;
    }




    public int getInvoice_type() {
        return invoice_type;
    }

    public void setInvoice_type(int invoice_type) {
        this.invoice_type = invoice_type;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }




    public double getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(double tax_amount) {
        this.tax_amount = tax_amount;
    }


    public String getFather_user_id() {
        return father_user_id;
    }

    public void setFather_user_id(String father_user_id) {
        this.father_user_id = father_user_id;
    }
}
