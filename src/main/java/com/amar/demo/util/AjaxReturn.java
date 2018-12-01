package com.amar.demo.util;

import java.io.Serializable;

/**
 * @author dingmx
 * @date 2018/12/1 16:29
 */
public class AjaxReturn implements Serializable {

    private String result;

    private Object data;

    private AjaxReturn(String result,Object data) {
        this.result = result;
        this.data = data;
    }

    public static String success(Object o) {
        return JacksonUtils.toJSon(new AjaxReturn("success", o));
    }

    public static String failure(Object o) {
        return JacksonUtils.toJSon(new AjaxReturn("failure", o));
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
