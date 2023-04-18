package entity;

public class Question {
	private int questionId;
	private String question;
	private String answer;
	private int type;
	private String difficult;
	private int quizId;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getDifficult() {
		return difficult;
	}
	public void setDifficult(String difficult) {
		this.difficult = difficult;
	}
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public Question(int questionId, String question, String answer, int type, String difficult, int quizId) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
		this.type = type;
		this.difficult = difficult;
		this.quizId = quizId;
	}
	public Question() {
		super();
	}
	
}
