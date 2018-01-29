package net.codingme.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;


/**
 * <p>Description：复杂类型的注入</p>
 * 
 * @author  NiuJinpeng
 * @date    2018年2月16日下午4:50:11
 */
public class Persion {
	
	private String username;
	private String[] arrs;
	private List<String> list;
	private Map<String , String > map;
	private Properties properties;
	
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void say() {
		System.out.println("[Persion] Hello I am "+username);
		System.out.println("[Persion] arrs is "+arrs);
		System.out.println("[Persion] list is "+list);
		System.out.println("[Persion] map is  "+map);
		System.out.println("[Persion] properties is  "+properties);
		
	}
}
