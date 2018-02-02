package net.codingme.spring.tx;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月20日下午8:22:19
 */
public class UserService {
	
	private UserDao userDao;
	
	public void transferAccount() {
		userDao.lessMoney();
		int  i = 10 / 0;
		userDao.moreMoney();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
}
