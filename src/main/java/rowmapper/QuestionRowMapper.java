package rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import entity.Question;

public class QuestionRowMapper implements RowMapper<Question> {

	@Override
	public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
		int questionId = rs.getInt("question_id");
		String question = rs.getString("question");
		String answer = rs.getString("answer");
		int type = rs.getInt("type");
		String diffucult = rs.getString("difficult");
		int quizId = rs.getInt("quiz_id");
		Question question1 = new Question(questionId, question, answer, type, diffucult, quizId);
		return question1;
	}

}
