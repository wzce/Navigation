package cn.edu.nju.software.notification.service.email;

import cn.edu.nju.software.notification.service.NotifyService;

import java.util.Map;


public interface EmailService extends NotifyService {
    boolean send(String emailAddress,String subject,String content);
    boolean send(String emailAddress,String subject, Map<String,String> map);
}
