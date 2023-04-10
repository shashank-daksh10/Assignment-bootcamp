package com.example.InherintanceMapping.singlemap.Singletable.repo;

import com.example.InherintanceMapping.singlemap.Singletable.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment,Integer> {
}
