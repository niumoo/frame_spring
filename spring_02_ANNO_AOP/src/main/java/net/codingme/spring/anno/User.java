package net.codingme.spring.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * <p>Description：使用注解创建对象</p>
 * @author  NiuJinpeng
 * @date    2018年2月16日下午6:05:27
 */

@Component(value="user")
@Scope(value="prototype")
public class User {
	
	public void say() {
		System.out.println("user........");
	}
}
