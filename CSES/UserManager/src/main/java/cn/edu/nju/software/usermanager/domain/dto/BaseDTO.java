package cn.edu.nju.software.usermanager.domain.dto;

import cn.edu.nju.software.usermanager.domain.entity.BaseEntity;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.Arrays;


public abstract class BaseDTO<T extends BaseEntity> {

    public abstract boolean checkLegal();

    public T toEntity(Class<T> tClass){
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

    protected boolean isStringParamLegal(String... strs){
        boolean legal= Arrays.stream(strs).anyMatch(s -> StringUtils.isEmptyOrWhitespaceOnly(s));
        return !legal;
    }

    protected boolean isLongParamLegal(Long... strs){
        boolean legal=Arrays.stream(strs).anyMatch(s -> s==null);
        return !legal;
    }

}
