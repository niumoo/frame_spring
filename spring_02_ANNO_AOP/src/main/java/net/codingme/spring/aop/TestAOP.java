package net.codingme.spring.aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月18日下午7:54:07
 */
public class TestAOP {
	
	@Test
	public void testAOP() {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-aop.xml");
		Order order = (Order) context.getBean("order");
		order.say();
	}

}
