package com.nju.edu.cn.nvg.service.user;

import com.nju.edu.cn.nvg.pojos.entity.Admin;
import com.nju.edu.cn.nvg.service.BaseService;

public interface AdminService extends BaseService<Admin> {
    boolean adminVerify(String userName,String pwd);
}
