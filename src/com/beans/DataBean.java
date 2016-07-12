package com.beans;

/**
 * Created by rcl on 2015/8/20.
 */
public class DataBean {

    private int error = 404;
    private Object object;
    private String errorInfo = "";

    public DataBean() {

    }

    public DataBean(int error, Object object, String errorInfo) {
        this.error = error;
        this.object = object;
        this.errorInfo = errorInfo;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {

        this.error = error;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
