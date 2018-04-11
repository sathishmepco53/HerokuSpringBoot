package com.cdac.intents;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class PbxHandler {
	
	String queryText;
	HashMap<String, String> pbxMap = new HashMap<>();
	public PbxHandler(String queryText){
		this.queryText = queryText;
		init();
	}
	
	private void init(){
		pbxMap.put("ranjit", "617");
		pbxMap.put("ranjith", "617");
		pbxMap.put("renjit", "617");
		pbxMap.put("ranjit pl", "617");
		
		pbxMap.put("sathish", "622");
		pbxMap.put("satish", "622");
		pbxMap.put("sathish kumar", "622");
		pbxMap.put("satish kumar", "622");
		
		pbxMap.put("arun", "623");
		pbxMap.put("arung", "623");
		
		pbxMap.put("rakesh", "614");
		pbxMap.put("raakesh", "614");
		pbxMap.put("rakesh t", "614");
		pbxMap.put("rakesht", "614");
		
		pbxMap.put("sai", "611");
		pbxMap.put("sai dharsan", "611");
		pbxMap.put("saidharsan", "611");
		
		pbxMap.put("bcl", "634");
		pbxMap.put("narasaiah", "634");
		pbxMap.put("bcl narasaiah", "634");
		pbxMap.put("bclnarasaiah", "634");
		
		pbxMap.put("atul", "618");
		pbxMap.put("athul", "618");
	}
	
	public String process(){
		queryText = queryText.toLowerCase();
		JSONObject jsonObject = new JSONObject();
		for(String key : pbxMap.keySet())
			if(queryText.contains(key)){
				jsonObject.put("fulfillmentText", "Pbx number is "+pbxMap.get(key));
				System.out.println("Pbx Found key is : "+key);
				System.out.println("Pbx Found no is : "+pbxMap.get(key));
				return jsonObject.toString();
			}
		return defaultMessage();
	}
	
	private String defaultMessage(){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fulfillmentText", "Sorry I didnt get you!");
		return jsonObject.toString();
	}

}
