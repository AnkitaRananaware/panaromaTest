package com.assesment.transactionservice.Service;

import com.assesment.transactionservice.Entity.Transaction;
import com.assesment.transactionservice.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	public List<Transaction> getTransactionsByStudentId(Long studentId) {
		return transactionRepository.findByStudentId(studentId);
	}
}
