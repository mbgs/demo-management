package management.bean.rest;

import java.io.Serializable;

public class RqLogin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3424010622027381555L;

	private String user;
	private String password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
