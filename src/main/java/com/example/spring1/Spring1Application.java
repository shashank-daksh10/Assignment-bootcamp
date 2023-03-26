package com.example.spring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		Add2 a= new Add2();
		int result=a.addition(55,55);

		//tight coupling

		System.out.println(result);
		//SpringApplication.run(Spring1Application.class, args);
	}

}
