package com.example.InherintanceMapping.pertable.repo;

import com.example.InherintanceMapping.pertable.entity.CheckPerTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckPaymentRepository extends JpaRepository<CheckPerTable,Integer> {
}
