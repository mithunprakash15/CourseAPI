package kn.springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepositary courserepositary;

	
	
	public List<courses> getAllCourses(String topicId)
	{
		List<courses> topic = new ArrayList<>();
		courserepositary.findByTopicId(topicId).forEach(topic :: add);
		return topic;
	}
	public Optional<courses> getCourse(String id)
	{
		return courserepositary.findById(id);
	}
	public void addCourse(courses cour) {
		courserepositary.save(cour);
	
		
	}
	public void updateCourse(String id, courses topic2) {
		
		courserepositary.save(topic2);
		
	}
	public void deleteCourse(String id) {
		courserepositary.deleteById(id);
		
	}


}
