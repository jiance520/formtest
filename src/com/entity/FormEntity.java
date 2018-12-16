package com.entity;

public class FormEntity {

	private String name ;
	private String email ;
	private String subject ;
	private String message ;
	private String language ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public FormEntity() {
		
	}
	public FormEntity(String name, String email, String subject,
			String message, String language) {
		
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.message = message;
		this.language = language;
	}
	
}
