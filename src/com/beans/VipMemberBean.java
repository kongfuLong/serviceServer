package com.beans;

/**
 * Created by rcl on 2015/8/11.
 * [{"clazz":"1","discount":"0.95","flag":"1","ids":"0"}] clazz折扣方式1打折2固定价格（如经销价，批发价）
 * discount折扣或价格等级0，1，2，3，4，5flag为1适用可多条，2不适用且只允许一条ids店铺编号，多个用逗号分隔0全场
 */

public class VipMemberBean {

    private Integer clazz = 1;
    private String discount = "1";
    private Integer flag = 1;
    private String ids = "0";

    public VipMemberBean() {

    }


    public VipMemberBean(Integer clazz, String discount, Integer flag, String ids) {
        this.clazz = clazz;
        this.discount = discount;
        this.flag = flag;
        this.ids = ids;
    }

    //是否符合vip
    public boolean ifVip(String sellid) {
        boolean b = false;
        String tmp = "," + ids + ",";
        if (flag == 1) {
            //使用字符串查找是否效率更高
            if ("0".equals(ids) || tmp.indexOf("," + sellid + ",") != -1) {
                b = true;
            } else {
                b = false;
            }
        } else {
            if (!"0".equals(ids) && tmp.indexOf("," + sellid + ",") == -1) {
                b = true;
            } else {
                b = false;
            }
        }

        return b;
    }

    public Integer getClazz() {
        return clazz;
    }

    public void setClazz(Integer clazz) {
        this.clazz = clazz;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}
