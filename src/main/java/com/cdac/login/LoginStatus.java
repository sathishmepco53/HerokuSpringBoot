package com.cdac.login;

import org.springframework.stereotype.Component;

@Component
public class LoginStatus {

	private String statusMessage;
	private boolean status;
	private Student student;
	
	public LoginStatus(){
		
	}
	
	public LoginStatus(String statusMessage, boolean status,Student student){
		this.statusMessage= statusMessage;
		this.status = status;
		if(student != null)
			student.setPassword(null);
		this.student = student;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}