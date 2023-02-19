package kn.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepositary topicrepositary;

	List<topics> topic = new ArrayList<topics>(Arrays.asList(
            new topics("Spring","Spring Framework","SF DESCRIPTION"),
            new topics("Java","Java Framework","JAVA DESCRIPTION"),
            new topics("X","X Framework","X DESCRIPTION")
			));
	
	public List<topics> getAllTopic()
	{
		List<topics> topic = new ArrayList<>();
		topicrepositary.findAll().forEach(topic :: add);
		return topic;
	}
	public Optional<topics> getTopic(String id)
	{
		return topicrepositary.findById(id);
	}
	public void addTopic(topics top) {
		topicrepositary.save(top);
	
		
	}
	public void updateTopic(String id, topics topic2) {
		
		topicrepositary.save(topic2);
		
	}
	public void deleteTopic(String id) {
		topicrepositary.deleteById(id);
		
	}


}
