package net.codingme.spring.jdnc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.plaf.synth.SynthStyle;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * <p>
 * Description：jdbcTemplate查询
 * 
 * @author NiuJinpeng
 * @date 2018年2月19日下午5:20:54
 */
public class JDBCTemplateQuery {
	// 设置数据库信息
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///androidweb");
		dataSource.setUsername("root");
		dataSource.setPassword("123");
		return dataSource;
	}
	
	// 查询单个数据
	@Test
	public void queryOne() {
		DriverManagerDataSource dataSource = getDataSource();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select count(*) from user";
		Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
		System.out.println(count);
	}
	
	// 使用jdbc查询对象数据
	@Test
	public void queryByJDBC()  {
		Connection conn =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 创建连接
			conn = DriverManager.getConnection("jdbc:mysql:///androidweb","root","123");
			String sql = "select * from user where id = ?";
			// 预编译SQL
			PreparedStatement pst = conn.prepareStatement(sql);
			// 设置参数值
			pst.setString(1, "3");
			// 执行SQL
			ResultSet rs = pst.executeQuery();
			// 遍历结果集合
			while(rs.next()) {
				// 从结果集中取出数据
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				
				// 把得到的数据封装到对象里面
				User user = new User();
				user.setId(id);
				user.setUsername(username);
				user.setPassword(password);
				System.out.println(user.toString());
			}
		} catch (Exception e) {
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 查询返回对象信息
	@Test
	public void queryObject() {
		DriverManagerDataSource dataSource = getDataSource();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from user where id = ?";
		User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(),3);
		System.out.println(user.toString());
	}
	
	// 查询结果集合list
	@Test
	public void queryList() {
		DriverManagerDataSource dataSource = getDataSource();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select * from user";
		List<User> userList = jdbcTemplate.query(sql,new UserRowMapper());
		for (User user : userList) {
			System.out.println(user);
		}

	}
	
	
}

class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int num) throws SQLException {
		// 从结果集中取出数据
		int id = rs.getInt("id");
		String username = rs.getString("username");
		String password = rs.getString("password");
		
		// 把得到的数据封装到对象里面
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		
		return user;
	}
	
}
