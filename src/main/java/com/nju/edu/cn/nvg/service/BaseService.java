package com.nju.edu.cn.nvg.service;

import java.util.List;

/**
 * Created by ENLINK on 2017/8/14.
 */
public interface BaseService<T> {

    /**
     * 分页查询，从当前页currentPage开始，查询pageSize条数据
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<T> search(int currentPage, int pageSize);

    List<T> getAll();

    List<T> search(int currentPage, int pageSize, String searchContent);

    List<T> search( String searchContent);

    T getEntityByKey(Object key);

    int add(T entity);

    int addWithDefaultValues(T entity);

    int delete(Object key, Long operatorId);

    int delete(List<Object> keys, Long operatorId);

    int batchDelete(Object[] keys, Long operatorId);
    /**
     * 所有字段都会被更新
     * @param entity
     * @return
     */
    int updateAll(T entity);
    /**
     * 更新的时候按主键更新，只有非空字段才会被更新
     * @param entity
     * @return
     */
    int updateNotNull(T entity);
}
