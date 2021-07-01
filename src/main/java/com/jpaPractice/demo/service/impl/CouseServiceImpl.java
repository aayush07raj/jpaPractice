package com.jpaPractice.demo.service.impl;

import com.jpaPractice.demo.entity.Course;
import com.jpaPractice.demo.repository.CourseRepository;
import com.jpaPractice.demo.service.CourseService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CouseServiceImpl implements CourseService {

    @Inject
    CourseRepository courseRepository;

//    List<Course> list;
//
//    public CouseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(145,"Java Core Course", "this course"));
//        list.add(new Course(1452,"Java Core Course", "this course"));
//    }


    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseRepository.getById(courseId);
//        Course c =null;
//        for(Course course: list){
//            if(course.getId()==courseId)
//            {
//                c=course;
//                break;
//            }
//        }
//        return c;
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
//        list.add(course);
//        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
        //        list.forEach(e ->{
//            if(e.getId() == course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
//        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        Course entity = courseRepository.getById(courseId);
        courseRepository.delete(entity);
//        list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }
}
