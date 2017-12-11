package com.taotao.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author zzff
 * @create 2017-12-11 16:44
 **/
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String getPage(@PathVariable("page") String page){
        return page;
    }
}
