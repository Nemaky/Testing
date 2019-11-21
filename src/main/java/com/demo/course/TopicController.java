package com.demo.course;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topic_service;

	@RequestMapping(value = "/topics", method = RequestMethod.GET)
	public List<Topic> GetAllTopics() {
		return topic_service.GetAllTopics();
	}

	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void AddTopic(@RequestBody Topic topics) {
		topic_service.addTopic(topics);
	}

}
