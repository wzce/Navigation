package cn.edu.nju.software.usermanager.api;

import cn.edu.nju.software.usermanager.client.MailClient;
import cn.edu.nju.software.usermanager.domain.dto.user.UserDTO;
import cn.edu.nju.software.usermanager.domain.entity.IdentifyCode;
import cn.edu.nju.software.usermanager.domain.entity.User;
import cn.edu.nju.software.usermanager.service.user.UserService;
import cn.edu.nju.software.usermanager.service.verify.VerifyService;
import cn.edu.nju.software.usermanager.utils.VerifyCodeGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    VerifyService verifyService;

    @Autowired
    MailClient mailClient;

    @RequestMapping(method = RequestMethod.GET)
    public Object search(@RequestParam(defaultValue = "1") int currentPage,
                           @RequestParam(defaultValue = "10") int pageSize,
                           String searchContent) {
        //查询，判断是否需要模糊查询
        List<User> userList;
        if (searchContent != null) {
            userList = userService.search(currentPage, pageSize, searchContent);
        } else {
            userList = userService.search(currentPage, pageSize);
        }
        return userList;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Object register(@RequestBody UserDTO userDTO) {
        //查询，判断是否需要模糊查询

        return null;
    }

    @RequestMapping(value = "/identifyCode/mail", method = RequestMethod.POST)
    public Object sendIdentifyCode(String hardCode,String email) {
        String verifyCode= VerifyCodeGeneratorUtil.generatorRandomLetters(6);

        //在本地服务数据库建立一个验证码记录
        IdentifyCode identifyCode=IdentifyCode.builder()
                .identifyCode(verifyCode)
                .hardCode(hardCode)
                .build();
        verifyService.add(identifyCode);

        boolean res=mailClient.sendMail(email,"验证码",verifyCode);
        if(res){
            return "success";
        }else {
            return "fail";
        }

    }


    @RequestMapping(value="/{userName}",method = RequestMethod.GET)
    public String hello(@PathVariable("userName") String userName){
        return "Hello " + userName;
    }
}
