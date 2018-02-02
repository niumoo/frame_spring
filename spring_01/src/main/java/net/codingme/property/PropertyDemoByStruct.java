package net.codingme.property;

/**
 * <p>Description：Spring注入方式1：使用构造方法</p>
 * 
 * @author  NiuJinpeng
 * @date    2018年2月16日下午3:10:47
 */
public class PropertyDemoByStruct {
	
	private String username;
	
	public PropertyDemoByStruct(String username) {
		this.username = username;
	}
	
	public void say() {
		System.out.println("[PropertyDemoByStruct] Hello , I am "+username);
	}
	
}
