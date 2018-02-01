package net.codingme.spring.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月20日上午9:43:02
 */
public class UserDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void save() {
		String sql = "INSERT INTO USER(`USERNAME`,`PASSWORD`) VALUES(?,?)";
		// 调用模版方法实现操作
		int row = jdbcTemplate.update(sql,"Darcy","123");
		System.out.println(row);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
