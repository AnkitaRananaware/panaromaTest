package com.assesment.studentservice.Service;

import com.assesment.studentservice.Entity.Student;
import com.assesment.studentservice.Entity.TransactionRequest;
import com.assesment.studentservice.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private RestTemplate restTemplate;


	private static final String TRANSACTION_SERVICE_URL = "http://transaction-service:8087/transactions";

	public Student saveStudent(Student student) {
		Student savedStudent = studentRepository.save(student);
		String transactionUrl = TRANSACTION_SERVICE_URL + "/save";
		TransactionRequest transaction = new TransactionRequest(savedStudent.getId(), savedStudent.getFee(), savedStudent.getTerm());

		// REST call
		 restTemplate.postForObject(transactionUrl , transaction, TransactionRequest.class);

		return savedStudent;
	}

	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
}
