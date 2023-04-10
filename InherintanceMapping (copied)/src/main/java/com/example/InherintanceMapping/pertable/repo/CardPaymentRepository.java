package com.example.InherintanceMapping.pertable.repo;

import com.example.InherintanceMapping.pertable.entity.CreditPerTable;
import com.example.InherintanceMapping.pertable.entity.PaymentPerTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardPaymentRepository extends JpaRepository<CreditPerTable,Integer> {
}
