package com.amar.demo.controller;

import com.amar.demo.util.AjaxReturn;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.lang.invoke.MethodType;

/**
 * @author dingmx
 * @date 2018/12/11 21:17
 */
@RestController
public class FileController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(@RequestParam(value = "file") MultipartFile file) {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());
        try {
            System.out.println(IOUtils.toString(file.getInputStream()));
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxReturn.failure("failure");
        }
        return AjaxReturn.success("success");
    }
}
