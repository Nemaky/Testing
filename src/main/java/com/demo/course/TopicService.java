package com.demo.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	@Autowired
	TopicRepository topicrepo;
	
	public List<Topic>GetAllTopics(){
		List<Topic>topics=new ArrayList<>();
		topicrepo.findAll()
		.forEach(topics::add);
		return topics;
	}
	

	public void addTopic(Topic topics) {
		topicrepo.save(topics);
	}

}