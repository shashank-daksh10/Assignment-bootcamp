package com.example.jpa3Assignment.question2.repos;

import com.example.jpa3Assignment.question2.entity.BookOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookOneRepo  extends JpaRepository<BookOne,Integer> {
}
