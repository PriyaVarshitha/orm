package com.loan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.loan.model.Customer;
import com.loan.model.LoanApplicantNominees;
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

	public void persiste(LoanApplicantNominees l) {
		em.persist(l);
	}

	public List<LoanApplicants> getAllNominees() {
		return em.createQuery("SELECT e FROM LoanApplicantNominees  e").getResultList();
	}

	public void persistCustomer(Customer l) {
		em.persist(l);
	}

	public List<Customer> getAllCustomers() {
		return em.createQuery("SELECT e FROM Customer  e").getResultList();
	}
}
