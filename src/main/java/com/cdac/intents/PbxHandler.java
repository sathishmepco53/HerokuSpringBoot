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
		pbxMap.put("saidharsan bhagat", "611");
		
		pbxMap.put("bcl", "634");
		pbxMap.put("narasaiah", "634");
		pbxMap.put("bcl narasaiah", "634");
		pbxMap.put("bclnarasaiah", "634");
		
		pbxMap.put("atul", "618");
		pbxMap.put("athul", "618");
		
		pbxMap.put("mahendra joshi", "548");
		pbxMap.put("mahendra", "548");
		pbxMap.put("mj", "548");
		pbxMap.put("gajanan lobhe", "549");
		pbxMap.put("gajanan", "549");
		pbxMap.put("chandrakant kate ", "555");
		pbxMap.put("chandrakant", "555");
		pbxMap.put("vikram k", "557");
		pbxMap.put("vikram", "557");
		pbxMap.put("charuhas s", "547");
		pbxMap.put("charuhass", "547");
		pbxMap.put("tirupati paik", "546");
		pbxMap.put("tirupati p", "546");
		pbxMap.put("tirupatip", "546");
		pbxMap.put("amol suroshe", "540");
		pbxMap.put("amols", "540");
		pbxMap.put("amol s", "540");
		
		pbxMap.put("madhavi salvi", "421");
		pbxMap.put("madhavi", "421");
		pbxMap.put("swapna ballal", "422");
		pbxMap.put("swapna", "422");
		pbxMap.put("ruta khanvilkar", "422");
		pbxMap.put("ruta", "422");
		
		pbxMap.put("sasi kumar", "530");
		pbxMap.put("sasi sir", "530");
		pbxMap.put("geeta nair", "531");
		pbxMap.put("geeta", "531");
		pbxMap.put("jitendra jagtap", "533");
		pbxMap.put("jitendra", "533");
		pbxMap.put("jeetu", "533");
		
		pbxMap.put("vanita kamath ", "411");
		pbxMap.put("vanita", "411");
		pbxMap.put("tushar koli", "412");
		pbxMap.put("tushar accounts", "412");
		pbxMap.put("dolly shroff", "413");
		pbxMap.put("dolly", "413");
		pbxMap.put("gayatri antani", "414");
		pbxMap.put("gayatri", "414");
		pbxMap.put("gayatri accounts", "414");
		pbxMap.put("dhanashri", "416");
		pbxMap.put("dhanashri accounts", "416");
		pbxMap.put("kunal hatkar", "415");
		pbxMap.put("kunal accounts", "415");
		pbxMap.put("anuradha aantosh", "417");
		pbxMap.put("anuradha accounts", "417");
		
		pbxMap.put("varsha", "400"); 
		pbxMap.put("course", "400");
		pbxMap.put("trupti", "401");
		pbxMap.put("trupti admin", "401");
		pbxMap.put("ramesh pawar", "402");
		pbxMap.put("ramesh admin", "402");
		pbxMap.put("sangita", "403");
		pbxMap.put("sangita admin", "403");
		pbxMap.put("lohakare", "404");
		pbxMap.put("lohakare admin", "404");
		pbxMap.put("sabrina", "406");
		pbxMap.put("sabrina admin", "406");
		pbxMap.put("manju", "407");
		pbxMap.put("manju admin", "407");
		pbxMap.put("gracy", "408");
		pbxMap.put("gracy admin", "408");
		pbxMap.put("jean", "409");
		pbxMap.put("jean admin", "409");
		pbxMap.put("sudha", "410");
		pbxMap.put("sudha admin", "410");
		
		pbxMap.put("hande", "418");
		pbxMap.put("laxman", "418");
		pbxMap.put("ghosh", "423");
		pbxMap.put("anuradha subramanium", "532");
		pbxMap.put("anuradha admin", "532");
		
		pbxMap.put("operator", "9");
		pbxMap.put("reception", "501");
		pbxMap.put("meeting room", "502 and 503");
		pbxMap.put("server room", "504");
		pbxMap.put("canteen", "505");
		pbxMap.put("seminar room", "506");
		pbxMap.put("lecture theatre", "507");
		pbxMap.put("sakpal", "507");
		pbxMap.put("speech lab", "510");
		
		pbxMap.put("savita rao", "426");
		pbxMap.put("savita", "426");
		pbxMap.put("savita library", "426");
		pbxMap.put("kavi raju", "427");
		
		pbxMap.put("padmaja joshi", "601");
		pbxMap.put("padmaja", "601");
		pbxMap.put("urja vora", "602");
		pbxMap.put("urja", "602");
		pbxMap.put("nirmala salam", "604");
		pbxMap.put("nirmala", "604");
		pbxMap.put("rekha nair", "605");
		pbxMap.put("rekha", "605");
		pbxMap.put("manish kumar", "607");
		pbxMap.put("manish", "607");
		pbxMap.put("kapil kant kamal", "608");
		pbxMap.put("kapil", "608");
		pbxMap.put("vijay jain", "609");
		pbxMap.put("vijay", "609");
		pbxMap.put("cini", "610");
		pbxMap.put("mohasin sutar", "612");
		pbxMap.put("mohasin", "612");
		pbxMap.put("sampath mendhe", "613");
		pbxMap.put("sampath", "613");
		pbxMap.put("golden raymond", "615");
		pbxMap.put("golden", "615");
		pbxMap.put("atul dhengre", "616");
		pbxMap.put("atul", "616");
		pbxMap.put("rajeev", "618");
		pbxMap.put("nipun pandey", "620");
		pbxMap.put("nipun", "620");
		pbxMap.put("naina sonawani", "624");
		pbxMap.put("naina", "624");
		pbxMap.put("avani", "625");
		pbxMap.put("shilpa oswal", "626");
		pbxMap.put("shilpa", "626");
		pbxMap.put("ahmad hasan", "627");
		pbxMap.put("aditya", "628");
		
		pbxMap.put("avinash", "631");
		pbxMap.put("amol k", "642");
		pbxMap.put("amolk", "642");
		
		pbxMap.put("itss", "amol suroshe 540 \n tirupati paik 546 \n charuhas s 547 \n mahendra joshi 548 \n gajanan lobhe 549 \n chandrakant kate 555 \n vikram k 557 ");
		pbxMap.put("hrd", "madhavi salvi 421 \n swapna ballal 422 \n ruta khanvilkar 422");
		pbxMap.put("hr", "madhavi 421 \n swapna 422 \n ruta 422");
		pbxMap.put("edoffice", "sasi kumar 530 \n geeta nair 531 \n jitendra jagtap 533");
		pbxMap.put("ed office", "sasi kumar 530 \n geeta nair 531 \n jitendra jagtap 533");
		pbxMap.put("accounts", "vanita kamath 411 \n tushar koli 412 \n dolly shroff 413 \n gayatri antani 414 \n kunal hatkar 415 \n Dhanashri/Seema 416 \n Anuradha Santosh/Sawant 417");
		pbxMap.put("admin", "Varsha Karkare / Course 400 \n Trupti Shah 401 \n Ramesh Pawar 402 \n Sangita Mulik 403 \n V .K. Lohakare 404 \n Sabrina Pereira 406 \n Manju Menon 407 \n Gracy Abreo 408 \n Jean jojo 409 \n Sudha iyer 410 \n J.D Hande / Laxman 418 \n B Ghosh 423 \n Anuradha Subramanium 532");
		pbxMap.put("library", "Trupti Shah 425 \n Savita Rao 426 \n Kavi Raju C 427");
		pbxMap.put("seng", "Dr. Padmaja Joshi 601 \n Dr. Urja Vora 602");
//		pbxMap.put("", "");
		
	}
	
	public String process(){
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
		jsonObject.put("fulfillmentText", "Sorry I didn\'t get you!");
		return jsonObject.toString();
	}

}
