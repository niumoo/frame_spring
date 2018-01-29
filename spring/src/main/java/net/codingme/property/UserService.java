package net.codingme.property;

/**
 * <p>Description：TODO</p>
 * 
 * @author  NiuJinpeng
 * @date    2018年2月16日下午3:37:18
 */
public class UserService {
	
	// 1.定义dao类型属性
	private UserDao userDao;
	// 2.生成set方法
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void add() {
		System.out.println("UserServcice.............");
		// 在service里面得到dao类的对象，然后调用里面的方法
		// UserDao userD = new UserDao();
		// userD.add();
		userDao.add();
	}

}
