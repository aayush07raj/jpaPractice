package com.jpaPractice.demo.service.impl;
import com.jpaPractice.demo.entity.Course;
import com.jpaPractice.demo.entity.Employee;
import com.jpaPractice.demo.repository.CourseRepository;
import com.jpaPractice.demo.repository.EmployeeRepository;
import com.jpaPractice.demo.service.CourseService;
import org.springframework.stereotype.Service;
import javax.inject.Inject;
import java.util.List;

@Service
public class CouseServiceImpl implements CourseService {

    @Inject
    CourseRepository courseRepository;

    @Inject
    EmployeeRepository employeeRepository;


    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseRepository.getById(courseId);

    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(long courseId) {
        Course entity = courseRepository.getById(courseId);
        courseRepository.delete(entity);
    }

    @Override
    public Employee getEmployeeId(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }
}
