package net.codingme.spring.anno;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description：测试注解开发
 * @author  NiuJinpeng
 * @date    2018年2月16日下午6:33:29
 */
public class TestAnno {
	
	@Test
	public void testUser() {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");
		User user  = (User) context.getBean("user");
		System.out.println(user);
		user.say();
	}

}
