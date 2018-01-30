package net.codingme.spring.anno2;

import org.springframework.stereotype.Component;

/**
 * <p>Description：使用注入属性注入
 * @author  NiuJinpeng
 * @date    2018年2月18日下午5:51:59
 */

@Component("userDao1")
public class UserDao {
	
	public void say() {
		System.out.println("UserDao say.........");
	}

}
