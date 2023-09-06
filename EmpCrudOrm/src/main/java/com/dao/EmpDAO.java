package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.model.Employee;

@Component
public class EmpDAO implements EmpDAOInterface {
	@PersistenceContext
	private EntityManager emp;

	@Override
	public void persist(Employee e) {
		emp.persist(e);
	}

	@Override
	public List<Employee> identifyAll() {
		// select chesinapudu employee ane model class ivali not table
		return emp.createQuery("SELECT e FROM Employee e").getResultList();
	}
}
