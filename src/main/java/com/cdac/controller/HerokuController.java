package com.cdac.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuController {
	
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@RequestMapping(value = "/call", method = RequestMethod.POST,headers = "Accept=application/json", produces = "application/json",consumes="application/json")
	public @ResponseBody String getInput(@RequestBody String request){
		System.out.println("Inside Call");
		System.out.println("Request Received is :: "+request);
		//return "{	color: \"red\",	value: \"#f00\"}";
		return "{\"fulfillmentText\": \"questions\",\"fulfillmentMessages\": [{\"speech\": \"result from Heroku\", \"displayText\": \"result form heroku\"}],\"source\": string,	\"payload\": {\"payload from heroku\"}}";
	}
}