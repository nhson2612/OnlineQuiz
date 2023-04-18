package DAO;

import entity.User;

public interface UserDAO {
	public void saveUser(User user);
	public User getUserByUserName(String userName);
}
