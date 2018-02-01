package net.codingme.spring.c3p0;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月20日上午9:43:16
 */
public class UsetTest {
	
	public void test() {
		// ComboPooledDataSource dataSource = new ComboPooledDataSource();
		// dataSource.setDriverClass(driverClass);
		// dataSource.setJdbcUrl(jdbcUrl);
		// dataSource.setUser(user);
		// dataSource.setPassword(password);
	}
	
	// 通过C3P0连接池结合XML配置注入使用JDBCTemplate测试保存功能
	@Test
	public void testUserService() {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-c3p0.xml");
		UserService userService = (UserService) context.getBean("userService");
		userService.save();
	}

}
