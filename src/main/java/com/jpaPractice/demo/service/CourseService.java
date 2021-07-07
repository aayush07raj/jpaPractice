package com.jpaPractice.demo.service;

import com.jpaPractice.demo.entity.Course;
import com.jpaPractice.demo.entity.Employee;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long courseId);

    Employee getEmployeeId(Employee employee);


//    List<Course> getTitles();
}
