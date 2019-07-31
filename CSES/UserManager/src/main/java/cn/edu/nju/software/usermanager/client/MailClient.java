package cn.edu.nju.software.usermanager.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "notification")
public interface MailClient {
    @RequestMapping(value="/v1/notification/email/send",method = RequestMethod.GET)
     boolean sendMail(@RequestParam("email") String email,
                            @RequestParam("subject") String subject,
                            @RequestParam("content") String content);
}
