package com.cdac.intents;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MainHandler {
	String request;
	public MainHandler(String request) {
		this.request = request;
	}
	
	public String process(){
		
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject;
		try {
			jsonObject = (JSONObject) jsonParser.parse(request);
			JSONObject queryResultObj = (JSONObject) jsonObject.get("queryResult");
			
			String queryText = (String) queryResultObj.get("queryText");
			String action = (String) queryResultObj.get("action");
			System.out.println("Query Text is : "+queryText);
			System.out.println("Action is : "+action);
			
			if(queryText.contains("pbx") || queryText.contains("number") || queryText.contains("no")){
				PbxHandler pbxHandler = new PbxHandler(queryText);
				return pbxHandler.process();
			}else if(queryText.contains("time")){
				
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return defaultMessage();
	}
	
	private String defaultMessage(){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fulfillmentText", "Sorry I didnt get you!");
		return jsonObject.toString();
	}
}
