package net.codingme.spring.c3p0;

/**
 * <p>Description：TODO
 * @author  NiuJinpeng
 * @date    2018年2月20日上午9:43:08
 */
public class UserService {

	private UserDao userDao;
	
	public void save() {
		userDao.save();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
}
