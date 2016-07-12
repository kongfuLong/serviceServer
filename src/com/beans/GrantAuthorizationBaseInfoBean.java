package com.beans;

/**
 * Created by rcl on 2015/9/21.
 */
public class GrantAuthorizationBaseInfoBean {

    private String openid;
    private String nick;
    private String sex;

    public GrantAuthorizationBaseInfoBean() {
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
