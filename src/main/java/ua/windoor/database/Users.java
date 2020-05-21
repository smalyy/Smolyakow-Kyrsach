package ua.windoor.database;

import java.io.Serializable;

public class Users implements Serializable {
	private int userId;
	private String login;
	private String password;
	private String eMail;
	private String phoneNumber;
	private String fName;
	private String sName;
	private int permision;

	private static final long serialVersionUID = 1L;

	public Users() {
	}

	public Users(String login, String password, String eMail, String phoneNumber, String fName, String sName,
			int permision) {
		this.login = login;
		this.password = password;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.fName = fName;
		this.sName = sName;
		this.permision = permision;
	}

	public Users(int userId, String login, String password, String eMail, String phoneNumber, String fName,
			String sName, int permision) {
		this.userId = userId;
		this.login = login;
		this.password = password;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.fName = fName;
		this.sName = sName;
		this.permision = permision;
	}

	public int getUserId() {
		return userId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String userName) {
		this.login = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFName() {
		return fName;
	}

	public void setFName(String secondName) {
		this.fName = secondName;
	}

	public String getSName() {
		return sName;
	}

	public void setSName(String firstName) {
		this.sName = firstName;
	}

	public int getPermision() {
		return permision;
	}

	public void setFirstName(int permision) {
		this.permision = permision;
	}
}
