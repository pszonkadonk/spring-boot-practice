package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.topic.Topic;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		return courseRepository.findByTopicId(topicId);
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}
	public void addCourse(Course c) {
		courseRepository.save(c);
	}
	
	public void updateCourse(Course c) {
		courseRepository.save(c);
	}
	
	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}




}
