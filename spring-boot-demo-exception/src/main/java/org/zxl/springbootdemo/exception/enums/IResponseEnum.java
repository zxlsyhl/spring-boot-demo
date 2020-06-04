package org.zxl.springbootdemo.exception.enums;

public enum IResponseEnum {
    ERROR_ONE(1, "异常1");
    private int code;
    private String mesage;

    IResponseEnum(int code, String mesage) {
        this.code = code;
        this.mesage = mesage;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMesage() {
        return mesage;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }
}
