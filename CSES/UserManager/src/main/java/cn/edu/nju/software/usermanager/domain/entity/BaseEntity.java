package cn.edu.nju.software.usermanager.domain.entity;

import cn.edu.nju.software.usermanager.domain.dto.BaseDTO;
import org.springframework.beans.BeanUtils;

import java.util.Date;



public class BaseEntity<T extends BaseDTO>{

    /**
     * 创建时间
     */
    public Date updateTime;

    public Date createTime;

    public Date deleteTime;

    /**
     * 是否删除标记（0未删除，1已删除）
     */
   // @Column(name = "deleteFlag")
    public Integer deleteFlag;

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public T toDTO(Class<T> tClass){
        T t= null;
        try {
            t = tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        BeanUtils.copyProperties(this, t);
        return t;
    }
}
