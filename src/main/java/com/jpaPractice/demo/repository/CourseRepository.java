package com.jpaPractice.demo.repository;

import com.jpaPractice.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {
//
//    @Query("select c from courses c.title")
//    public List<Course> getCourseTitle();

}
