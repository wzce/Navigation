package cn.edu.nju.software.notification.controller;

import cn.edu.nju.software.notification.service.email.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/notification/email")
public class EmailController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    EmailService emailService;

    @RequestMapping(value="/{userName}",method = RequestMethod.GET)
    public String hello(@PathVariable("userName") String userName){
        return "Hello " + userName;
    }

    @RequestMapping(value="send",method = RequestMethod.GET)
    public boolean sendMail(@RequestParam("email") String email,
                            @RequestParam("subject") String subject,
                            @RequestParam("content") String content){
//        log.info("------------接收到发送的邮件-----------{}, 内容是{}",email,content);
//        Recipient recipient=new Recipient();
//        recipient.setAccountName("wzce13");
//        recipient.setEmail("MF1732135@smail.nju.edu.cn");

        boolean res=emailService.send(email,subject,content);

//        log.info("------------发送了邮件-----------{}, 内容是{}",email,content);
        return res;
    }
}
