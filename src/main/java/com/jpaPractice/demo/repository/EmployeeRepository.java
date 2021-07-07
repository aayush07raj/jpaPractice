package com.jpaPractice.demo.repository;

import com.jpaPractice.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value="select * from employee",nativeQuery = true)
     Employee findEmployeeId();
}
