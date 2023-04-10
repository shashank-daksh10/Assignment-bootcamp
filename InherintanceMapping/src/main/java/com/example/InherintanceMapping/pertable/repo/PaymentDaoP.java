package com.example.InherintanceMapping.pertable.repo;

import com.example.InherintanceMapping.pertable.entity.PaymentPerTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDaoP extends JpaRepository<PaymentPerTable,Integer> {
}
