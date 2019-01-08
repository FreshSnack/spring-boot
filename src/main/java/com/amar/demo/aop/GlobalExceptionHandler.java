package com.amar.demo.aop;

import com.amar.demo.exception.BusinessException;
import com.amar.demo.util.AjaxReturn;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Author: mxding
 * @Date: 2018-12-12 09:43
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    @ResponseBody
    public String handlerRuntimeException(RuntimeException e) {
        return AjaxReturn.failure("[RuntimeException]" + e.getMessage());
    }

    @ExceptionHandler({BusinessException.class})
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    @ResponseBody
    public String handlerBusinessException(BusinessException e) {
        return AjaxReturn.failure("[BusinessException]" + e.getMessage());
    }
}
