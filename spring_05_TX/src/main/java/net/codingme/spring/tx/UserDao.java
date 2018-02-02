package net.codingme.spring.tx;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月20日下午8:18:44
 */
public class UserDao {
	
	private JdbcTemplate jdbcTemplate;
	
	// 减少1000元钱
	public void lessMoney() {
		String sql = "UPDATE BALANCE SET SALARY = SALARY - ? WHERE USERNAME = ? ";
		jdbcTemplate.update(sql,1000,"NIU");
	}
	
	// 增加1000元钱
	public void moreMoney() {
		String sql = "UPDATE BALANCE SET SALARY = SALARY + ? WHERE USERNAME = ? ";
		jdbcTemplate.update(sql,1000,"ZXY");
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}
