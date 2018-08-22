package com.xugb.utils;

import com.github.pagehelper.PageInfo;

import com.xugb.entity.ext.TablePage;
import org.springframework.stereotype.Component;

/**
 * Created by nbfujx on 2018/1/9.
 */
@Component
public class PageUtil {

     public TablePage getDataForPaging(PageInfo pageInfo)
     {
         TablePage tp=new TablePage();
         tp.setCode(0);
         tp.setMsg("");
         tp.setTotal(pageInfo.getTotal());
         tp.setRows(pageInfo.getList());
         return tp;
     }
}
