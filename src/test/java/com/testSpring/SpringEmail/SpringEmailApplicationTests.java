package com.testSpring.SpringEmail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringEmailApplicationTests {
	@Autowired
	private  MailUtil mailUtil;
	@Autowired
	private SendMail sendMail;
/*	@Autowired
	private UserController userController;*/
	@Test
	void contextLoads() {
		sendMail.sendMail("2127554091@qq.com",sendMail.subject,sendMail.sendText+mailUtil.setSendText());
	}

/*
	@Test
	void dateGetById(){
		userController.save();
		userController.findAll();
	}
*/



}
