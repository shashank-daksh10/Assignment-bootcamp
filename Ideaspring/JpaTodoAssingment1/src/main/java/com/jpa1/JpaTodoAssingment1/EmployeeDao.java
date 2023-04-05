package com.jpa1.JpaTodoAssingment1;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> ,
        PagingAndSortingRepository<Employee,Integer> {

    // implemented finder methods
    List<Employee> findByName(String name,Pageable p);

    List<Employee>findByNameStartingWith(String name ,Pageable p);//combination of findbyname and start with

    List<Employee >findByAgeIsBetween(int min,int max);



    /*

     */









}

