package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmpDAOInterface {
	void persist(Employee e);

	List<Employee> identifyAll();
}
