package com.taotao.shop.controller;

import com.taotao.shop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ${DESCRIPTION}
 *
 * @author zzff
 * @create 2017-12-10 21:08
 **/
@Controller
public class TestController {
    @Autowired
    private TestService service;
    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return  service.getNow();
    }

}
