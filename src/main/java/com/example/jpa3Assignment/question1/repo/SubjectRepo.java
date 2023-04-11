package com.example.jpa3Assignment.question1.repo;

import com.example.jpa3Assignment.question1.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject,Integer> {
}
