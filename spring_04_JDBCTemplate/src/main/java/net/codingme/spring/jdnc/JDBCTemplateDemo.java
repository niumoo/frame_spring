package net.codingme.spring.jdnc;

import javax.swing.plaf.synth.SynthStyle;

import org.junit.Test;
import org.springframework.beans.factory.wiring.BeanWiringInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * <p>Description：spring的jdbcTemplate的使用
 * @author  NiuJinpeng
 * @date    2018年2月19日下午5:09:46
 */
public class JDBCTemplateDemo {
	
	@Test
	public void save() {
		// 设置数据库信息
		DriverManagerDataSource dataSource = getDataSource();
		// 创建模版对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		// 创建sql语句
		String sql = "INSERT INTO USER(`USERNAME`,`PASSWORD`) VALUES(?,?)";
		// 调用模版方法实现操作
		int row = jdbcTemplate.update(sql,"zxy","love");
		System.out.println(row);
	}
	
	// 设置数据库信息
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///androidweb");
		dataSource.setUsername("root");
		dataSource.setPassword("123");
		return dataSource;
	}
	
	@Test
	public void delete() {
		// 设置数据库信息
		DriverManagerDataSource dataSource = getDataSource();
		// 创建模版对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		// 创建sql语句
		String sql = "DELETE FROM USER WHERE USERNAME = ?";
		// 调用模版方法实现操作
		int row = jdbcTemplate.update(sql,"123");
		System.out.println(row);
	}
	
	
	@Test
	public void update() {
		// 设置数据库信息
		DriverManagerDataSource dataSource = getDataSource();
		// 创建模版对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		// 创建sql语句
		String sql = "UPDATE USER SET PASSWORD = ? WHERE USERNAME = ?";
		// 调用模版方法实现操作
		int row = jdbcTemplate.update(sql,"lovexy","niu");
		System.out.println(row);
	}
	
	
	
}
