package net.codingme.ioc;

/**
 * Description：
 * 			原始方法调用测试
 * @author  Darcy
 * @date    2017年10月19日上午9:15:29
 * @version 1.0
 */
public class User {
	public void add() {
		System.out.println("User add.........");
	}
	public static void main(String[] args) {
		User user = new User();
		user.add();
	}
}
