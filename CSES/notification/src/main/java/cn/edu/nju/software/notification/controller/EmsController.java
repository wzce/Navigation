package cn.edu.nju.software.notification.controller;

import cn.edu.nju.software.notification.service.sms.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/notification/ems")
public class EmsController {
    @Autowired
    MessageService messageService;

    @RequestMapping(method = RequestMethod.POST)
    boolean sendMessage(@RequestParam("phoneNumber") String phoneNumber,
                        @RequestParam("content") String content,
                        @RequestParam("header") String header,
                        @RequestParam(defaultValue = "请勿转发") String tailInfo){
        return messageService.sendMessage(phoneNumber,content,header,tailInfo);
    }
}
