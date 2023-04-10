package com.example.jpa2Assignment.repo;

import com.example.jpa2Assignment.Entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface EmployeeRepo extends JpaRepository<Employee,Integer>,PagingAndSortingRepository<Employee,Integer> {

    @Query("Select firstName,lastName from Employee where salary>(Select AVG(salary) from Employee) Order by age asc" +
            ",salary desc")
    List<Object[]> findDefined();

    @Modifying
    @Transactional
    @Query("Update Employee SET salary=:increment WHERE salary<:avgSalary")
    void updateEmployeesBySalary(@Param("increment") int increment,@Param("avgSalary") Long avgSalary);

    @Query("Select AVG(salary) from Employee") // used in above query
    Long avgSalary();

    @Modifying
    @Transactional
    @Query("Delete From Employee WHERE salary=:minSalary")
    void deleteEmployeeWithMinSalary(@Param("minSalary") Long minSalary);

    @Query("Select MIN(salary) from Employee")//used in above query.
    Long minSalary();

    @Query(value = "Select emp_id,emp_first_name,emp_age From employee_table WHERE (emp_last_name=:str);",nativeQuery = true)
    List<Object[]> getEmployeesWithSingh(@Param("str") String str);

    @Modifying
    @Transactional
    @Query(value = "Delete From employee_table where (emp_age>:age);",nativeQuery = true)
    void deleteEmployeesByAge(@Param("age") int age);


}



