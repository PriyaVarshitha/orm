package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Employee;
import com.service.EmpService;

@Controller
public class EmpCRUDController {
	EmpService empserv;

	@Autowired
	public EmpCRUDController(EmpService empserv) {
		this.empserv = empserv;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String giveAllEmployee(Model m) {
		System.out.print("empolyee are requested");
		List<Employee> e = empserv.listAll();
		m.addAttribute("emplist", e);
		return "listemp";
	}

	@RequestMapping(value = "/addnewemp", method = RequestMethod.GET)
	public String addNewEmployee(Model model) {
		System.out.println("successfully added new employee");
		return "newemp";
	}

	@RequestMapping(value = "/savenewemp", method = RequestMethod.GET)
	public String saveNewEmployee(Employee emp, Model model) {
		System.out.println("Save New Employee");
		// get all employees from DAO
		System.out.println(emp);
		empserv.add(emp);

		model.addAttribute("empi", emp);

		return "saveemp";
	}

}
