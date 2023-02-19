package kn.springboot.course;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kn.springboot.topic.topics;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@RequestMapping("/topics/{id}/courses")
	public List<courses> getAllCourses(@PathVariable String id)
	{
		return courseservice.getAllCourses(id);
	}
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Optional<courses> getCourse(@PathVariable String id)
	{
		return courseservice.getCourse(id);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicid}/courses")
	public void addCourse(@RequestBody courses course,@PathVariable String topicid)
	{
		course.setTopic(new topics(topicid,"",""));
		 courseservice.addCourse(course);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicid}/courses/{id}")
	public void updateCourse(@RequestBody courses course,@PathVariable String topicid,@PathVariable String id )
	{
		course.setTopic(new topics(topicid,"",""));
		 courseservice.updateCourse(id,course);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicid}/courses/{id}")
	public void deleteCourse(@PathVariable String id )
	{
		 courseservice.deleteCourse(id);
	}
	

}
