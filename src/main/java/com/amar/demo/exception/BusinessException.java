package com.amar.demo.exception;

/**
 * @Author: mxding
 * @Date: 2018-12-12 09:38
 */
public class BusinessException extends RuntimeException  {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
