package com.example.InherintanceMapping.joined.repo;

import com.example.InherintanceMapping.joined.entity.PaymentJoined;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDaoJ extends JpaRepository<PaymentJoined,Integer> {
}
