package com.taotao.shop.service.impl;

import com.taotao.mapper.TestMapper;
import com.taotao.shop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author zzff
 * @create 2017-12-10 21:10
 **/
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper mapper;
    @Override
    public String getNow() {
        return mapper.getNow();
    }
}
