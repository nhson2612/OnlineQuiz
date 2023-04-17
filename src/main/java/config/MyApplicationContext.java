package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import DAO.UserDAO;
import DAO.UserDAOImpl;
import service.UserService;
import service.UserServiceImpl;

@Configuration
@ComponentScan("controller")
public class MyApplicationContext {
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("WEB-INF/view/", ".jsp");
		return viewResolver;
	}
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword(null);
		dataSource.setUrl("jdbc:mysql://localhost:3306/quiz_online");
		return dataSource;
	}
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}
	@Bean
	public UserDAO getUserDAO() {
		UserDAOImpl userDAO = new UserDAOImpl();
		userDAO.setDataSource(getDataSource());
		userDAO.setJdbcTemplate(getJdbcTemplate());
		return userDAO;
	}
	@Bean
	public UserService getUserService() {
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDAO(getUserDAO());
		return userService;
	}
}
