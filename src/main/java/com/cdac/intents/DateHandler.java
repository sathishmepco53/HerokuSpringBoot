package com.cdac.intents;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.json.simple.JSONObject;

public class DateHandler {
	
	String queryText;
	
	public DateHandler(String queryText){
		this.queryText = queryText;
	}
	
	public String process(){
		queryText = queryText.toLowerCase();
		JSONObject jsonObject = new JSONObject();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		Calendar calendar = Calendar.getInstance();
		if(queryText.contains("tomorrow"))
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		else if(queryText.contains("yesterday"))
			calendar.add(Calendar.DAY_OF_MONTH, -11);
		String time = sdf.format(new Date(calendar.getTimeInMillis()));
		jsonObject.put("fulfillmentText", time);
		return jsonObject.toString();
	}

}
