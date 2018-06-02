package com.cdac.login;

import org.springframework.stereotype.Component;

@Component
public class RegisterStatus {
	
	String message;
	boolean status;
	
	public RegisterStatus(){
		
	}
	
	public RegisterStatus(String message, boolean status){
		this.message = message;
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}