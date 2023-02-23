package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	public CourseServiceImpl() {
		//list=new ArrayList<>();
		//list.add(new Course(1,"Java","Core Java"));
		//list.add(new Course(2,"Spring boot","Creating rest API's"));
	}
	
	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int courseId) {
		
		Optional<Course> c=courseDao.findById(courseId);
		if(c.isPresent()) {
			Course cs=c.get();
			return cs;
		}
		else {
			return null;
		}
	}
	
	@Override
	public Course addCourse(Course course) {
		int id=course.getId();
		Optional<Course> c=courseDao.findById(id);
		if(c.isPresent()) {
			return null;
		}
		else {
			courseDao.save(course);
			return course;
		}
		
	}
	
	@Override
	public Course updateCourse(Course course) {
		int id=course.getId();
		Optional<Course> c=courseDao.findById(id);
		if(c.isPresent()) {
			courseDao.save(course);
			return course;
		}
		return null;
		
	}

	@Override
	public Course deleteCourse(int courseId) {
		Optional<Course> c=courseDao.findById(courseId);
		if(c.isPresent()) {
			Course cs=c.get();
			courseDao.deleteById(courseId);
			return cs;
		}
		return null;
	}

	

	
	
	
}
