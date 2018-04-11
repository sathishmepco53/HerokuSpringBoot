package com.cdac.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/test")
	public String test(){
		return "Test";
	}
	
	@RequestMapping(value="/test2", method = RequestMethod.GET)
	public String hello2(){
		return "hello Sathish";
	}
}	