package entity;

import java.util.Date;

public class Quiz {
	private int quiId;
	private String quizName;
	private long time;
	private String createBy;
	private Date createDate;
	private String modifyBy;
	private Date modifyDate;
	private int numberOfQuestion;
	public int getNumberOfQuestion() {
		return numberOfQuestion;
	}
	public void setNumberOfQuestion(int numberOfQuestion) {
		this.numberOfQuestion = numberOfQuestion;
	}
	public int getQuiId() {
		return quiId;
	}
	public void setQuiId(int quiId) {
		this.quiId = quiId;
	}
	public String getQuizName() {
		return quizName;
	}
	public void setQuizName(String quizName) {
		this.quizName = quizName;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Quiz(int quiId, String quizName, long time, String createBy, Date createDate, String modifyBy,
			Date modifyDate,int numberOfQuestion) {
		super();
		this.quiId = quiId;
		this.quizName = quizName;
		this.time = time;
		this.createBy = createBy;
		this.createDate = createDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.numberOfQuestion = numberOfQuestion;
	}
	public Quiz() {
		super();
	}
	
}
