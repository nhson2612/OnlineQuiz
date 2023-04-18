package DAO;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import entity.Question;
import rowmapper.QuestionRowMapper;

public class QuestionDAOImpl implements QuestionDAO {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public QuestionDAOImpl() {
		super();
	}

	public QuestionDAOImpl(DataSource dataSource, JdbcTemplate jdbcTemplate) {
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
	public void saveQuestion(Question question) {
		String sqlStatement = "INSERT INTO question(question , answer, type , diffucult, quiz_id) VALUES(?,?,?,?,?)";
		Object[] sqlParameter = {question.getQuestion() , question.getAnswer() , question.getType() , question.getDifficult() , question.getQuestionId()};
		jdbcTemplate.update(sqlStatement, sqlParameter);
	}

	@Override
	public List<Question> getQuestionsByType(int type) {
		String sqlStatement = "SELECT * FROM question WHERE type = ?";
		ArrayList<Question> questions = (ArrayList<Question>) jdbcTemplate.query(sqlStatement, new QuestionRowMapper(), type);
		return questions;
	}

}
