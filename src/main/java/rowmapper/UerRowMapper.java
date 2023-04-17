package rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.User;

public class UerRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		int id = rs.getInt("user_id");
		String userName = rs.getString("user_name");
		String passWord = rs.getString("password");
		String email = rs.getString("email");
		int role = rs.getInt("role");
		User user = new User(id, userName, passWord, email, role);
		return user;
	}

}
