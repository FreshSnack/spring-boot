package com.amar.demo.resolver;

import com.amar.demo.util.JacksonUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @Author: mxding
 * @Date: 2018-12-11 13:47
 */
public class MethodArgumentsJsonResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(FormModel.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        Class paramClass = parameter.getParameterType();
        String paramName = parameter.getParameterName();
        String jsonStr = webRequest.getParameter(paramName);
        Object object = JacksonUtils.readValue(jsonStr, paramClass);
        return object;
    }
}
