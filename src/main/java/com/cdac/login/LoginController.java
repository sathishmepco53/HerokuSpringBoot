package com.cdac.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class LoginController {
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public LoginStatus login(@RequestParam String username,@RequestParam String password){
		return studentservice.login(username, password);
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public RegisterStatus register(@RequestBody Student student){
		return studentservice.register(student);
	}

	public StudentService getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}
}