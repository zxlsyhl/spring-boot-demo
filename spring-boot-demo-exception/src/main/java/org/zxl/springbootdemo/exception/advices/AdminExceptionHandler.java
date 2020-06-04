package org.zxl.springbootdemo.exception.advices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zxl.springbootdemo.exception.error.MyException;
import org.zxl.springbootdemo.exception.tools.APIResponse;

@ControllerAdvice
public class AdminExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(AdminExceptionHandler.class);

    /**
     * 系统异常捕获处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public APIResponse javaExceptionHandler(Exception ex){
        logger.error("捕捉到Exception异常:{}",ex.getMessage());

        //异常日志入库
        return new APIResponse(APIResponse.FAIL, ex.getMessage(), null);

    }

    /**
     * 自定义异常捕获处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public APIResponse messageCenterExceptionHandler(MyException ex){
        logger.error("捕获到Myexception异常：{}", ex.getMessage());
        logger.error("捕获到Myexception异常详情：{}", ex);

        return ex.getApiResponse();
    }
}
