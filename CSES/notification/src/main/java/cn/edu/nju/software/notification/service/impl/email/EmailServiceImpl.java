package cn.edu.nju.software.notification.service.impl.email;

import cn.edu.nju.software.notification.service.email.EmailService;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.*;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
public class EmailServiceImpl implements EmailService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    private static final String fromMail="3104527459@qq.com";

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private Environment env;

//    @Autowired
//    private VelocityEngine velocityEngine;


    @Override
    public boolean send(String emailAddress, String subject, String content) {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setFrom(fromMail);//该行去掉就无法发出邮件，也是难过
            helper.setTo(emailAddress);
            helper.setSubject(subject);
            helper.setText(content);
            mailSender.send(message);
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
        }
       return false;

    }

    @Override
    public boolean send(String emailAddress,String subject, Map<String, String> map) {
        boolean res=false;
//        MimeMessagePreparator preparator = new MimeMessagePreparator() {
//            @Override
//            public void prepare(MimeMessage mimeMessage) throws Exception {
//                MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "utf-8");   // 设置 utf-8防止出现乱码
//                message.setTo(emailAddress);
//                message.setFrom(new InternetAddress(fromMail));
//                message.setSubject(subject);
//                Map model = new HashMap<>();
//                message.setText(VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,
//                        "register.vm",
//                        "utf-8", model),
//                        true);
//            }
//        };
//        try {
//            mailSender.send(preparator);
//        } catch (MailException ex) {
//            res = false;
//            ex.printStackTrace();
//        }
        return res;
    }


}
