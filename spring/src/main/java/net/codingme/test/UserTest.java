package net.codingme.test;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.codingme.bean.User;

/**
 * 
 * <p>Description：IOC入门测试
 * 
 * 
 * @author  Darcy Niu
 * @date    2017年10月24日下午1:20:34
 * @version 1.0
 */
public class UserTest {

	/**
	 *  使用无参构造方法创建bean
	 * 获取User bean test 
	 * @throws Exception 未找到异常
	 */
	@Test
	public void test() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user.toString());
	}
	
	/**
	 * 使用静态工厂实例化bean
	 * @throws Exception
	 */
	@Test
	public void testByStaticFactory()throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) applicationContext.getBean("userByStatic");
		System.out.println(user.toString());
		//net.codingme.ioc.User@56aac163
	}
	
	/**
	 * 使用静态工厂实例化bean
	 * @throws Exception
	 */
	@Test
	public void testByInstanceFactory()throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) applicationContext.getBean("userByInstanceFactory");
		System.out.println(user.toString());
		//net.codingme.bean.User@1f7030a6
	}
	
	
	
	


}