package DAO;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import entity.User;
import rowmapper.UerRowMapper;

public class UserDAOImpl implements UserDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	
	public UserDAOImpl() {
		super();
	}

	public UserDAOImpl(DataSource dataSource, JdbcTemplate jdbcTemplate) {
		super();
		this.dataSource = dataSource;
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveUser(User user) {
		String sqlStatement = "INSERT INTO user(user_name,password,email,role) VALUES(?,?,?,?)";
		Object[] sqlParameter = {user.getUserName(),user.getPassWord(),user.getEmail(),user.getRole()};
		jdbcTemplate.update(sqlStatement, sqlParameter);

	}

	@Override
	public User getUserByUserName(String userName) {
		String sqlStatement = "SELECT * FROM user WHERE user_name = ?";
		User user = jdbcTemplate.queryForObject(sqlStatement, new UerRowMapper(), userName);
		return user;
	}

}
