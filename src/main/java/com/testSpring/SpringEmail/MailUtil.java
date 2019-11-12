package com.testSpring.SpringEmail;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class MailUtil {

    public String setSendText(){
        Integer x =(int)((Math.random()*9+1)*10000);
        return ""+x;
    }

    public SimpleMailMessage sendMailMessage(String to,String subject , String  text){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(text);
        simpleMailMessage.setFrom("1398769331@qq.com");
        simpleMailMessage.setTo(to);
        return simpleMailMessage;
    }
}
