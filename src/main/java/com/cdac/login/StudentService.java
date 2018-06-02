package com.cdac.login;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private ArrayList<Student> studentList = new ArrayList<>();
	
	@Autowired
	private LoginStatus loginStatus;
	@Autowired
	private RegisterStatus registerStatus;
	
	public StudentService(){
		studentList = new ArrayList<>();
	}
	
	public LoginStatus login(String username, String password){
		try{
			Student s = studentList.stream().filter(temp -> temp.getUsername().equals(username) && temp.getPassword().equals(password)).findFirst().get();
			if(s == null)
				return getLoginObject("invalid username or password", false,null);
			return getLoginObject("Successfully logged in", true,s);
		}catch(Exception e){
			e.printStackTrace();
			return getLoginObject("invalid username or password", false,null);
		}
	}
	
	public RegisterStatus register(Student student){
		try{
			Student s = studentList.stream().filter(temp -> temp.getUsername().equals(student.getUsername())).findFirst().get();
			if(s == null){
				studentList.add(student);
				return new RegisterStatus("Successfully Registered", true);
			}
			return new RegisterStatus("Username already exist", false);
		}catch(NoSuchElementException ne){
			ne.printStackTrace();
			studentList.add(student);
			return new RegisterStatus("Successfully Registered", true);
		}
		catch(Exception e){
			e.printStackTrace();
			return new RegisterStatus("Unable to add student", false);
		}
	}
	
	private LoginStatus getLoginObject(String message, boolean status, Student student){
		loginStatus.setStatusMessage(message);
		loginStatus.setStatus(status);
		loginStatus.setStudent(student);
		return loginStatus;
	}
}