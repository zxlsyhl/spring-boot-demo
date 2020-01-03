package org.zxl.springbootdemo.jwt.util;

/**
 * @author zhangxiaolong
 * @ClassName Result
 * @Description TODO
 * @Date 2019/3/16 10:45
 * @Version 1.0
 **/
public class Result<T> {
    private ResultCodeEnum code;
    private String message;
    private T data;

    public ResultCodeEnum getCode() {
        return code;
    }

    public void setCode(ResultCodeEnum code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
