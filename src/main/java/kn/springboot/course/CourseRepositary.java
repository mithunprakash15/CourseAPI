package kn.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepositary extends CrudRepository<courses,String>{

	public List<courses> findByTopicId(String topicId);
}
