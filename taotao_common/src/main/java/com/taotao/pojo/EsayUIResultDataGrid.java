package com.taotao.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author zzff
 * @create 2017-12-11 17:39
 **/
public class EsayUIResultDataGrid implements Serializable{
    private Long total;
    private List rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
