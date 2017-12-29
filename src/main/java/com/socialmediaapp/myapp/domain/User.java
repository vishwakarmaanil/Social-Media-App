package com.socialmediaapp.myapp.domain;

public class User {
	private String username;
	private String password;
	public String accountype;
	private boolean termsOfCondition;

	public boolean isTermsOfCondition() {
		return termsOfCondition;
	}

	public void setTermsOfCondition(boolean termsOfCondition) {
		this.termsOfCondition = termsOfCondition;
	}

	public String getAccountype() {
		return accountype;
	}

	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;

	}

	public void setPassword(String password) {
		this.password = password;
	}

}
