package net.codingme.spring.anno2;


import javax.annotation.Resource;

import org.springframework.stereotype.Component;


/**
 * <p>Description：使用autowired注入属性
 * @author  NiuJinpeng
 * @date    2018年2月18日下午5:53:02
 */
@Component("userService")
public class UserService {
	
	// 得到userDao对象，首先定义dao类型属性，然后使用注解完成注入,不需要set方法
//	@Autowired
//	private UserDao userDao;
	
	// name的值要与注解类中的value相同
	@Resource(name="userDao")
	private UserDao userDao;
	
	
	public void say() {
		System.out.println("UserService say ...........");
		userDao.say();
	}
	

}
