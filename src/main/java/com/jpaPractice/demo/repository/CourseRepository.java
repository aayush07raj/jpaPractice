package com.jpaPractice.demo.repository;

import com.jpaPractice.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
