package cn.edu.nju.software.usermanager.service.impl;

import cn.edu.nju.software.usermanager.dao.BaseMapper;
import cn.edu.nju.software.usermanager.domain.entity.BaseEntity;
import cn.edu.nju.software.usermanager.service.BaseService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class BaseServiceImpl<T extends BaseEntity, Mapper extends BaseMapper<T>> implements BaseService<T> {

    @Autowired
    public Mapper mapper;

    @Override
    public List<T> search(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        return mapper.selectAll();
    }

    @Override
    public List<T> getAll() {
        return mapper.selectAll();
    }

    @Override
    public List<T> search(int currentPage, int pageSize, String searchContent) {
        PageHelper.startPage(currentPage, pageSize);
        return mapper.search(searchContent);
    }

    @Override
    public T getEntityByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public int add(T entity) {
        Date now= new Date(System.currentTimeMillis());
        entity.setDeleteFlag(0);
        entity.setCreateTime(now);
        entity.setUpdateTime(now);
        return mapper.insertSelective(entity);
    }

    @Override
    public int addWithDefaultValues(T entity) {
        Date now= new Date(System.currentTimeMillis());
        entity.setCreateTime(now);
        entity.setDeleteFlag(0);
        entity.setUpdateTime(now);
        return mapper.insertSelective(entity);
    }

    @Override
    public int delete(Object key) {
        T t = mapper.selectByPrimaryKey(key);
        if (t != null) {
            t.setDeleteFlag(1);
            return mapper.updateByPrimaryKeySelective(t);
        }
        return 0;
    }

    @Override
    public int batchDelete(Object[] keys) {
        List<Object> list = new ArrayList();
        for (Object key : keys) {
            list.add(key);
        }
        return mapper.batchSoftDelete(list,new Date(System.currentTimeMillis()));
    }

    @Override
    public int updateAll(T entity) {
        entity.setUpdateTime(new Date(System.currentTimeMillis()));
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateNotNull(T entity) {
        entity.setUpdateTime(new Date(System.currentTimeMillis()));
        return mapper.updateByPrimaryKeySelective(entity);
    }

//    @Override
//    public boolean isNameExist(String name) {
//        return mapper.selectByName(name)!=null;
//    }
//
//    @Override
//    public boolean isNameExist(Long id, String name) {
//        return mapper.selectOtherByName(id,name)!=null;
//    }
}
