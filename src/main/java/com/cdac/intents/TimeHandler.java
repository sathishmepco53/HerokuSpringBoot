package com.cdac.intents;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.json.simple.JSONObject;

public class TimeHandler {
	
	String queryText;
	
	public TimeHandler(String queryText){
		this.queryText = queryText;
	}
	
	public String process(){
		JSONObject jsonObject = new JSONObject();
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Calcutta"));
		SimpleDateFormat sdf = new SimpleDateFormat("hh mm");
		String time = sdf.format(new Date());
		jsonObject.put("fulfillmentText", time);
		return jsonObject.toString();
	}
}
