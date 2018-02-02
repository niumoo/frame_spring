package net.codingme.spring.tx;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月20日下午8:25:17
 */
public class TestUser {
	
	@Test
	public void testUserService() {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-tx.xml");
		UserService userService = (UserService) context.getBean("userService");
		userService.transferAccount();
	}

}
