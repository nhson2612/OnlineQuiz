package entity;

import org.hibernate.validator.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
	private int id;
	@NotNull(message = "Không được bỏ trống phần này")
	@NotBlank(message = "Không được bỏ trống phần này")
	@Size(min = 1,max = 100,message = "Username nên có độ dìa trong khoảng 1-100")
	private String userName;
	private String passWord;
	private String email;
	private int role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public User(int id, String userName, String passWord, String email, int role) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.role = role;
	}
	public User() {
		
	}
	
}
