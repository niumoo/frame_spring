package net.codingme.spring.anno2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月18日下午5:54:59
 */
public class TestAnno {
	
	@Test
	public void testUserService() {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring2.xml");
		UserService userService = (UserService) 
				context.getBean("userService");
		userService.say();
	}

}
