package com.nju.edu.cn.nvg.pojos;

import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by ENLINK on 2017/8/8.
 */
public class BaseEntity{

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    public Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "update_time")
    protected Date updateTime;

    /**
     * 删除的时间
     */
    @Column(name = "delete_time")
    protected Date deleteTime;

    /**
     * 创建者id
     */
    @Column(name = "create_operator")
    protected Long createOperator;

    /**
     * 最后修改者id
     */
    @Column(name = "update_operator")
    protected Long updateOperator;

    /**
     * 删除者id
     */
    @Column(name = "delete_operator")
    protected Long deleteOperator;

    /**
     * 是否删除标记（0未删除，1已删除）
     */
    @Column(name = "delete_flag")
    protected Integer deleteFlag;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Long getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(Long createOperator) {
        this.createOperator = createOperator;
    }

    public Long getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(Long updateOperator) {
        this.updateOperator = updateOperator;
    }

    public Long getDeleteOperator() {
        return deleteOperator;
    }

    public void setDeleteOperator(Long deleteOperator) {
        this.deleteOperator = deleteOperator;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

//    public T toDTO(Class<T> tClass){
//        T t= null;
//        try {
//            t = tClass.newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        BeanUtils.copyProperties(this, t);
//        return t;
//    }
}
