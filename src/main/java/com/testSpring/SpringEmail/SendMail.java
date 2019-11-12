package com.testSpring.SpringEmail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component

public class SendMail {
    @Autowired
    JavaMailSenderImpl javaMailSender;
    @Value("${mail.subject}")
    String subject;
    @Value("${mail.sendText}")
    String sendText;

    public String getSubject() {
        return subject;
    }

    public String getSendText() {
        return sendText;
    }

    public void sendMail(String to , String subject, String sendText){
        javaMailSender.send(new MailUtil().sendMailMessage(to,subject,sendText));
        System.out.println("邮件已发送");
    }


}
