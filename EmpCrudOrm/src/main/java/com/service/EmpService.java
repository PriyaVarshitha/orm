package com.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmpDAO;
import com.model.Employee;

public class EmpService {
	@Autowired
	private EmpDAO empdao;

	@Transactional
	public void add(Employee e) {
		empdao.persist(e);
	}

	@Transactional
	public void addAll(Collection<Employee> empList) {
		for (Employee emp : empList) {
			empdao.persist(emp);
		}
	}

	@Transactional(readOnly = true)
	public List<Employee> listAll() {
		return empdao.identifyAll();

	}

}
