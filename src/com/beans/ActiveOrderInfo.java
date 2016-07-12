package com.beans;

/**
 * Created by rcl on 2015/10/19.
 * 如同普通订单进行下订单操作  作废
 */
public class ActiveOrderInfo extends OrderInfo {

    private String number = "1";
    private String order_remark = "";
    private String delivery_type = "";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
