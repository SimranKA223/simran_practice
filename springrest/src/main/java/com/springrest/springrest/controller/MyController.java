package com.springrest.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;


@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public ResponseEntity<String> home() {
		return new ResponseEntity<>("This is Home", HttpStatus.OK);
	}
	
	//get courses
	@GetMapping("/courses")
	public ResponseEntity<Object> getCourse(){
		List<Course> ls = this.courseService.getCourse();
		
		if(ls.isEmpty()) {
			return new ResponseEntity<Object>( "No Records Found", HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Object>( ls, HttpStatus.OK);
	}
	
	@GetMapping("/courses/{courseId}")
	public ResponseEntity<Object> getCourse(@PathVariable String courseId) {
		Course c=this.courseService.getCourse((int)Integer.parseInt(courseId));
		if(c==null) {
			return new ResponseEntity<Object>("no records found", HttpStatus.NOT_FOUND); 
		}
		return new ResponseEntity<Object>(c,HttpStatus.OK);
	}
	
	@PostMapping("/courses")
	public ResponseEntity<Object> addStudent(@RequestBody Course course){
		Course c=this.courseService.addCourse(course);
		if(c==null) {
			return new ResponseEntity<Object>("Course already Exists", HttpStatus.NOT_ACCEPTABLE);
		}
		else
		return new ResponseEntity<Object>(c, HttpStatus.CREATED);
	}
	
	@PutMapping("/courses")
	public ResponseEntity<Object> updateStudent(@RequestBody Course course) {
		Course c=this.courseService.updateCourse(course);
		if(c==null) {
			return new ResponseEntity<Object>("Course doesn't Exist", HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Object>(c, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<Object> deleteStudent(@PathVariable String courseId) {
		Course c=this.courseService.deleteCourse((int) Integer.parseInt(courseId));
		if(c==null) {
			return new ResponseEntity<Object>("Course doesn't Exist", HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Object>(c, HttpStatus.ACCEPTED);
	}
	
	
}
