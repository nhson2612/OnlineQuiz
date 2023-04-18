package DAO;

import java.util.List;

import entity.Question;

public interface QuestionDAO {
	public void saveQuestion(Question question);
	public List<Question> getQuestionsByType(int type);
}
