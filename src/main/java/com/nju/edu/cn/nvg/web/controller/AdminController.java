package com.nju.edu.cn.nvg.web.controller;

//import com.alibaba.druid.util.StringUtils;
import com.nju.edu.cn.nvg.service.user.AdminService;
import com.nju.edu.cn.nvg.util.Code;
import com.nju.edu.cn.nvg.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Response login(@RequestParam("userName") String userName,
                          @RequestParam("password") String password,
                          HttpServletRequest request) {
        HttpSession session = request.getSession();

        //参数检查
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
            return Response.error(new Code(Code.ERROR.ERROR_COMMON_LACK_REQUIRED_PARAM));
        }

//        String encodePassword = null;
//        try {
//            encodePassword = MD5Encrypt.MD5Encode(password);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }

        if (adminService.adminVerify(userName, password)) {
            return Response.success(session.getId());
        }

        return Response.error(new Code(Code.ERROR.ERROR_LOGIN_101));
    }

}
