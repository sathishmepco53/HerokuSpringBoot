package com.cdac.topics;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>();
	
	public TopicService(){
		topics.add(new Topic("1", "Java", "Core Java for beginners"));
		topics.add(new Topic("2", "Dot Net", "Dot Net for beginners"));
		topics.add(new Topic("3", "Android", "Advanced Android Concepts"));
		topics.add(new Topic("4","iOS","iOS in swift language"));
	}

	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public String addTopci(Topic topic){
		try{
			Topic t1 = topics.stream().filter(t -> t.getId().equals(topic.getId())).findFirst().get();
			if(t1 == null){
				topics.add(topic);
				return "Topic added successfully.";
			}else{
				return "Unable to add topic as it already exist";
			}	
		}catch(NoSuchElementException e){
			e.printStackTrace();
			topics.add(topic);
			return "Topic added successfully.";
		}
	}
	
	public String updateTopic(String id, Topic topic){
		for(int i=0;i<topics.size();i++){
			if(topics.get(i).getId().equals(id)){
				topics.set(i, topic);
				return "Topic successfully updated";
			}
		}
		return "No such topic is available";
	}
	
	public String deleteTopic(String id){
		for(int i=0;i<topics.size();i++){
			if(topics.get(i).getId().equals(id)){
				topics.remove(i);
				return "Topic deleted successfully";
			}
		}
		return "No such topic is available";
	}
}
