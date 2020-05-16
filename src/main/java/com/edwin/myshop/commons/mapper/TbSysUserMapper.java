package com.edwin.myshop.commons.mapper;


import com.edwin.myshop.commons.domain.TbSysUser;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.MyMapper;

public interface TbSysUserMapper extends MyMapper<TbSysUser> {

    @Select("select *from tb_sys_user where login_code = #{loginCode}")
    public TbSysUser login(String loginCode);
}