package com.example.jpa3Assignment;

import com.example.jpa3Assignment.question1.entity.Address;
import com.example.jpa3Assignment.question1.entity.Author;
import com.example.jpa3Assignment.question1.repo.AuthorRepo;
import com.example.jpa3Assignment.question1.entity.Subject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class Jpa3AssignmentApplicationTests {

	@Autowired
	AuthorRepo authorRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void create(){
		Author au = new Author();
		au.setAuthorId(1);
		au.setAddress(new Address("ww","ee","sws"));
		Subject s1 = new Subject(21,"english",au);
		Subject s2 = new Subject(23,"hindi",au);
		List<Subject>ans=new ArrayList<>();
		ans.add(s1);
		ans.add(s2);
		au.setSubjects(ans);

		authorRepo.save(au);

		Optional<Author> ss=authorRepo.findById(1);

	}

}
