package cn.edu.nju.software.notification.service.sms;

public interface MessageService {
	
	boolean sendMessage(String phoneNumber,String content,String header, String tailInfo);
	boolean sendMessageByBusiness(String username, String secret, String phoneNumber, String code);
}
