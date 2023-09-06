package com.loan.dao;

import java.util.List;

import com.loan.model.LoanApplicants;

public interface LoanDAO {
	void persist(LoanApplicants l);

	List<LoanApplicants> getAllEmployees();
}
