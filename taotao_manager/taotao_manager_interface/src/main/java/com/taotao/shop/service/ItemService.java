package com.taotao.shop.service;


import com.taotao.pojo.EsayUIResultDataGrid;

/**
 * ${DESCRIPTION}
 *
 * @author zzff
 * @create 2017-12-11 17:30
 **/
public interface ItemService {
    EsayUIResultDataGrid findItemByPage(Integer page, Integer rows);
}
