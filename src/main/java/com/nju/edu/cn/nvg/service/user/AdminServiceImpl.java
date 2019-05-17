package com.nju.edu.cn.nvg.service.user;

import com.nju.edu.cn.nvg.dao.mapper.AdminMapper;
import com.nju.edu.cn.nvg.pojos.entity.Admin;
import com.nju.edu.cn.nvg.service.BaseServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin, AdminMapper> implements AdminService {


    @Override
    public boolean adminVerify(String userName, String pwd) {
        return mapper.selectWithName(userName,pwd)==null;
    }
}
