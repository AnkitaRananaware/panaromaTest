package com.assesment.studentservice.Entity;

public class TransactionRequest {
	private Long studentId;
	private double fee;
	private String term;

	public TransactionRequest(Long studentId, double fee, String term) {
		this.studentId = studentId;
		this.fee = fee;
		this.term = term;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}
}
