package net.codingme.spring.txanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月20日下午8:22:19
 */
@Component
@Transactional
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void transferAccount() {
		userDao.lessMoney();
		// int i = 10 / 0;
		userDao.moreMoney();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
}
