package com.example.InherintanceMapping.Singletable.repo;

import com.example.InherintanceMapping.Singletable.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment,Integer> {
}
