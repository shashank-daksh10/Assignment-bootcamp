package com.example.InherintanceMapping.joined.repo;

import com.example.InherintanceMapping.joined.entity.CreditJoined;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditPaymentJ extends JpaRepository<CreditJoined,Integer> {
}
