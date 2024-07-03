package com.assesment.transactionservice.Repository;

import com.assesment.transactionservice.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	List<Transaction> findByStudentId(Long studentId);
}
