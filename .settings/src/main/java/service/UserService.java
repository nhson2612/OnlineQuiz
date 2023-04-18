package service;

import DAO.UserDAO;
import entity.User;

public interface UserService {
	public void saveUser(User user);
	public User getUserByUserName(String userName);
}
