package cn.edu.nju.software.notification.service.impl.sms;

import cn.edu.nju.software.notification.service.sms.MessageService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

@Service
public class MessageServiceImpl implements MessageService {
    private final static String defaultHeader = "验证码：";
    private final static String defaultTail = "，请勿转发。";
    private final static String username = "18658895709";
    private static final String secret = "fe6e14729d1e4a428696aaeddec52e22";

    @Override
    public boolean sendMessage(String phoneNumber,String content, String header,String tailInfo) {
        String url = "http://sms.shumitech.com/api/send?" +
                "username=" + username + "&" +
                "user_secret=" + secret;
        return sendMessage(url, phoneNumber,content,header, tailInfo);
    }

    @Override
    public boolean sendMessageByBusiness(String username, String secret, String phoneNumber, String code) {
        if (username == null || secret == null) {
            return sendMessage(phoneNumber, code,null,null);
        }
        String url = "http://sms.shumitech.com/api/send?" +
                "username=" + username + "&" +
                "user_secret=" + secret;
        return sendMessage(url, phoneNumber, code,null,null);
    }

    private boolean sendMessage(String url, String phoneNumber,String content, String header,String tailInfo) {
        String result = "";
        BufferedReader in;
        StringBuilder sb = new StringBuilder(url);
        sb.append("&mobile=");
        sb.append(phoneNumber);
        sb.append("&content=");
        try {
            if(!StringUtils.isEmpty(header)){
                sb.append(URLEncoder.encode(header, "UTF-8"));
            }else {
                sb.append(URLEncoder.encode(defaultHeader, "UTF-8"));
            }
            sb.append(content);

            if(!StringUtils.isEmpty(tailInfo)){
                sb.append(URLEncoder.encode("，"+tailInfo+"。", "UTF-8"));
            }else {
                sb.append(URLEncoder.encode(defaultTail, "UTF-8"));
            }

        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        String urlNameStr = sb.toString();
        try {
            URL realUrl = new URL(urlNameStr);
            URLConnection connection = realUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.connect();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        String line;
        try {
            while ((line = in.readLine()) != null) {
                result += line;
            }
            JSONObject jsonObject = JSON.parseObject(result);
            if (jsonObject.getIntValue("code") == 0) {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

}
