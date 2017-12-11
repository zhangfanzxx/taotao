package com.taotao.shop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.EsayUIResultDataGrid;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zzff
 * @create 2017-12-11 17:31
 **/
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper mapper;

    @Override
    public EsayUIResultDataGrid findItemByPage(Integer page, Integer rows) {
        TbItemExample example =new TbItemExample();
        PageHelper.startPage(page, rows);
        List<TbItem> items = mapper.selectByExample(example);
        PageInfo info = new PageInfo(items);
        EsayUIResultDataGrid vo = new EsayUIResultDataGrid();
        vo.setTotal(info.getTotal());
        vo.setRows(items);
        return vo;
    }
}
