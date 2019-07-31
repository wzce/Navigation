package cn.edu.nju.software.usermanager.dao;

import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

/**
 * Created by ENLINK on 2017/8/14.
 */
public interface BaseMapper<T> {

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Object key);

    int updateByPrimaryKeySelective(T t);

    //更新全部的
    int updateByPrimaryKey(T t);

    int batchSoftDelete(@Param("list") List<Object> list,
                        @Param("deleteTime") Date updateTime);

    List<T> search(@Param("searchContent") String searchContent);

    List<T> selectAll();

}
