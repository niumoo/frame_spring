package net.codingme.spring.anno3;


import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 * <p>Description：使用autowired注入属性
 * @author  NiuJinpeng
 * @date    2018年2月18日下午5:53:02
 */
public class UserService {
	
	// name的值要与注解类中的value相同
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Resource(name="orderDao")
	private OrderDao orderDao;
	
	
	public void say() {
		System.out.println("UserService say ...........");
		userDao.say();
		orderDao.say();
	}
	

}
