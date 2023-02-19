package kn.springboot.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<topics> getAllTopics()
	{
		return topicservice.getAllTopic();
	}
	@RequestMapping("/topics/{id}")
	public Optional<topics> getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody topics topic)
	{
		 topicservice.addTopic(topic);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{id}")
	public void updateTopic(@RequestBody topics topic,@PathVariable String id )
	{
		 topicservice.updateTopic(id,topic);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id )
	{
		 topicservice.deleteTopic(id);
	}
	

}
