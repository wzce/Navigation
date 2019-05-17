package com.nju.edu.cn.nvg.dao.mapper;

import com.nju.edu.cn.nvg.dao.BaseMapper;
import com.nju.edu.cn.nvg.pojos.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper extends BaseMapper<Admin> {
    Admin selectWithName(@Param("adminName")String adminName,@Param("password") String pwd);
}