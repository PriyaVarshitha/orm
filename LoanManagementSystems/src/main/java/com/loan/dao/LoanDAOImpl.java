package com.loan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.loan.model.LoanApplicants;

public class LoanDAOImpl {
	@PersistenceContext
	private EntityManager em;

	public void persist(LoanApplicants l) {
		em.persist(l);
	}

	public List<LoanApplicants> getAllEmployees() {
		return em.createQuery("SELECT e FROM LoanApplicants  e").getResultList();
	}
}
