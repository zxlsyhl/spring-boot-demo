package org.zxl.springbootdemo.jwt.util;

/**
 * @author zhangxiaolong
 * @ClassName ResultGenerator
 * @Description TODO
 * @Date 2019/3/16 10:50
 * @Version 1.0
 **/
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    //成功
    public static Result getSuccessResult(){
        Result result = new Result();
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setCode(ResultCodeEnum.SUCCESS);
        return result;
    }

    //成功
    public static<T> Result<T> getSuccessResult(T data){
        Result result = new Result();
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setCode(ResultCodeEnum.SUCCESS);
        result.setData(data);
        return result;
    }

    public static Result getFailResult(String message) {
        Result result = new Result();
        result.setMessage(message);
        result.setCode(ResultCodeEnum.FAIL);
        return result;
    }

    public static Result getUnauthorizedResult() {
        Result result = new Result();
        result.setMessage("权限不足");
        result.setCode(ResultCodeEnum.UNAUTHORIZED);
        return result;
    }
}
