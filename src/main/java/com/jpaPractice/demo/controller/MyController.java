package com.jpaPractice.demo.controller;

import com.jpaPractice.demo.entity.Course;
import com.jpaPractice.demo.entity.Employee;
import com.jpaPractice.demo.repository.EmployeeRepository;
import com.jpaPractice.demo.service.CourseService;
//import com.jpaPractice.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
public class MyController {

    @Inject private CourseService service;

//    @Inject private EmployeeService serviceEmp;

    @Inject
    private EmployeeRepository employeeRepository;

    @PostMapping("/generate")
    public Employee generateId(@RequestBody Employee employee){
        return service.getEmployeeId(employee);
    }

    @GetMapping("/getDAta")
    public List<Employee> getData(){
        return employeeRepository.findAll();
    }

    @GetMapping("/home")
    public String home(){
        return "this is home url";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return service.getCourses();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.service.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(value = "/add",consumes = "application/json")
    public Course addCourse(@RequestBody Course course){
        return  this.service.addCourse(course);
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course){
        return this.service.updateCourse(course);
    }


    @DeleteMapping("/course/{courseId}")
    public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String courseId){
        try{
            this.service.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @GetMapping("/titles")
//    public List<Course> getAllTitle(){
//        return service.getTitles();
//    }
}
