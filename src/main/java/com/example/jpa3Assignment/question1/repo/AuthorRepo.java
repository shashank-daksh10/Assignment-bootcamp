package com.example.jpa3Assignment.question1.repo;

import com.example.jpa3Assignment.question1.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Integer> {

}
