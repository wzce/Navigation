package com.nju.edu.cn.nvg.dao.mapper;

import com.nju.edu.cn.nvg.dao.BaseMapper;
import com.nju.edu.cn.nvg.pojos.entity.Link;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LinkMapper extends BaseMapper<Link> {

    List<Link> selectByCategory(@Param("categoryId") Long categoryId);

}