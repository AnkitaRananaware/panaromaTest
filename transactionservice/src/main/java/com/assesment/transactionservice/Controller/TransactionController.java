package com.assesment.transactionservice.Controller;

import com.assesment.transactionservice.Entity.Transaction;
import com.assesment.transactionservice.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@PostMapping(value="save")
	public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
		return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
	}

	@GetMapping("/student/{studentId}")
	public ResponseEntity<List<Transaction>> getTransactionsByStudentId(@PathVariable Long studentId) {
		return new ResponseEntity<>(transactionService.getTransactionsByStudentId(studentId), HttpStatus.OK);
	}
}


