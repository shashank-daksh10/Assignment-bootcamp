package com.example.InherintanceMapping.componentMapping.repo;

import com.example.InherintanceMapping.componentMapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
