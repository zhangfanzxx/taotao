package com.taotao.shop.controller;

import com.taotao.pojo.EsayUIResultDataGrid;
import com.taotao.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ${DESCRIPTION}
 *
 * @author zzff
 * @create 2017-12-11 17:27
 **/
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("item/list")
    @ResponseBody
    public EsayUIResultDataGrid findItemByPage(Integer page, Integer rows){
        return itemService.findItemByPage(page, rows);
    }


}
