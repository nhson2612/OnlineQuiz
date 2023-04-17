package service;

import DAO.UserDAO;
import entity.User;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	
	public UserServiceImpl() {
		super();
	}

	public UserServiceImpl(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void saveUser(User user) {
		userDAO.saveUser(user);

	}

	@Override
	public User getUserByUserName(String userName) {
		User user = userDAO.getUserByUserName(userName);
		return user;
	}

}
