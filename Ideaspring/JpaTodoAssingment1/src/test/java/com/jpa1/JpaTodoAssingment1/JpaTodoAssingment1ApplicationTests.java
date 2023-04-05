package com.jpa1.JpaTodoAssingment1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JpaTodoAssingment1ApplicationTests {
	@Autowired
	EmployeeDao employeeDao;

	@Test
	void contextLoads() {
	}
    @Test
	void dUMMY() {
		List<Employee> list=employeeDao.findByAgeIsBetween(10,22);
		list.forEach(e-> System.out.println(e));
	}

}
