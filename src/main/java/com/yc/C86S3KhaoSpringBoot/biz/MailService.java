package com.yc.C86S3KhaoSpringBoot.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	private JavaMailSender mailSender;
	
	//从spring的配置文件中获取一个配置
	@Value("${mail.fromMail.addr}")
	private String from;
	
	public void sendSimpleMail(String to,String subject,String content) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(content);
		mailSender.send(message);
	}
}

@Configuration
class MailConfiguration {
	@Bean
	public JavaMailSenderImpl JavaMailSender(){
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.qq.com");
		mailSender.setUsername("2316377605@qq.com");
		mailSender.setPassword("qrwchidxfflfebfb");
		return  mailSender;
	}
}