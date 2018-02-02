package net.codingme.property;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test1 {

	/**
	 * 有参构造注入bean
	 * 
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		PropertyDemoByStruct property = (PropertyDemoByStruct) applicationContext.getBean("propertyDemoByStruct");
		property.say();
	}

	// 测试set注入方式
	@Test
	public void test2() throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		Book book = (Book) applicationContext.getBean("book");
		book.say();
	}

	// 测试类型注入
	@Test
	public void test3() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.add();
	}

	// 4.4.4 使用P标签注入属性Spring2.x 版本后提供的方式
	@Test
	public void test4() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		Persion persion = (Persion) applicationContext.getBean("persion");
		persion.say();
	}

	// 4.4.4 注入复杂类型属性值 
	@Test
	public void test5() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		Persion persion = (Persion) applicationContext.getBean("persion2");
		persion.say();
	}

}

