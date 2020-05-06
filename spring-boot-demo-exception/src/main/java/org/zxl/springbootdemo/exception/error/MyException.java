package org.zxl.springbootdemo.exception.error;

import org.zxl.springbootdemo.exception.tools.APIResponse;

public class MyException extends RuntimeException{
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MyException() {
    }

    public MyException(String code, String message){
        super(message);
        this.code = code;
    }
    public APIResponse getApiResponse() {
        return new APIResponse(this.code, super.getMessage(), null);
    }


}
