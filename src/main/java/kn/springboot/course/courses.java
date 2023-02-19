package kn.springboot.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import kn.springboot.topic.topics;

@Entity
public class courses {
	
	@Id
	private String id;
	
	private String name;
	private String description;
	
	@ManyToOne
	private topics topic;
	
	public courses() {
		
	}
	
	public courses(String id, String name, String description,String topicid) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new topics(topicid,"",""); 
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public topics getTopic() {
		return topic;
	}

	public void setTopic(topics topic) {
		this.topic = topic;
	}
	
	

}
