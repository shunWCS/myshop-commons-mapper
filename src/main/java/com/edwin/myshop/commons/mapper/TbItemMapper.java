package com.edwin.myshop.commons.mapper;

import com.edwin.myshop.commons.domain.TbItem;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface TbItemMapper extends MyMapper<TbItem> {

    @Select("select * from tb_item ")
    List<TbItem> selectByItem(Object object);
}