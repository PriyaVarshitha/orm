package com.loan.service;

import java.util.Collection;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.loan.dao.LoanDAOImpl;
import com.loan.model.LoanApplicants;

public class LoanService {
	private LoanDAOImpl loandao;

	public LoanService(LoanDAOImpl loandao) {
		this.loandao = loandao;
	}

	@Transactional
	public void add(LoanApplicants l) {
		loandao.persist(l);
	}

	@Transactional
	public void addAll(Collection<LoanApplicants> l) {
		for (LoanApplicants loan : l) {
			loandao.persist(loan);
		}
	}

	@Transactional(readOnly = true)
	public List<LoanApplicants> listAll() {
		return loandao.getAllEmployees();

	}
}
