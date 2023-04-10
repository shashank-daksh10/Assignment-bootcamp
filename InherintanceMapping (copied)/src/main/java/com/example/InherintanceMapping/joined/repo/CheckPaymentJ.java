package com.example.InherintanceMapping.joined.repo;

import com.example.InherintanceMapping.joined.entity.CheckJoined;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckPaymentJ extends JpaRepository<CheckJoined,Integer> {
}
