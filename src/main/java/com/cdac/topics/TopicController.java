package com.cdac.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cdac")
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topics")
	public String addTopic(@RequestBody Topic topic){
		return topicService.addTopci(topic);
	}
	
	@PutMapping("/topics/{id}")
	public String updateTopic(@PathVariable String id, @RequestBody Topic topic){
		return topicService.updateTopic(id,topic);
	}
	
	@DeleteMapping("/topics/{id}")
	public String deleteTopic(@PathVariable String id){
		return topicService.deleteTopic(id);
	}
}
