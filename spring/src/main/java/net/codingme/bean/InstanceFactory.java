package net.codingme.bean;

/**
 * <p>Description：使用实例工厂获取bean</p>
 * 
 * 
 * @author  NiuJinpeng
 * @date    2018年1月1日下午9:25:11
 * @version 1.0
 */
public class InstanceFactory {
	
	public User getUser() {
		return new User();
	}

}
