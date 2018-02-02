package net.codingme.spring.txanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月20日下午8:18:44
 */

@Component("userDao")
public class UserDao {
	
	@Autowired
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
	
}
