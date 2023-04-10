package com.example.jpa2Assignment;

import com.example.jpa2Assignment.repo.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class Jpa2AssignmentApplicationTests {
	@Autowired
	EmployeeRepo employeeRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void test_select(){

	}

}
