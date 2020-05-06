package org.zxl.springbootdemo.exception.tools;

public class APIResponse {
    public static final String FAIL = "9999";
    public static final String SUCC = "0000";

    private String code;
    private String message;
    private Object content;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public APIResponse() {
    }

    public APIResponse(String code, String message, Object content) {
        this.code = code;
        this.message = message;
        this.content = content;
    }

}
