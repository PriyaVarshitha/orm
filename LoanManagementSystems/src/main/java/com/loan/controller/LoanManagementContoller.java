package com.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loan.model.Application;
import com.loan.model.LoanApplicants;
import com.loan.service.LoanService;

@Controller
public class LoanManagementContoller {

	LoanService loanserv;

	@Autowired
	public LoanManagementContoller(LoanService loanserv) {
		this.loanserv = loanserv;
	}

	@RequestMapping(value = "/loanlist", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		System.out.println("loan List JSP Requested");

		List<LoanApplicants> l = loanserv.listAll();

		// set it to the model
		model.addAttribute("list", l);

		// call the view
		return "loanlist";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String tab(Model model) {
		System.out.println("loan List JSP Requested");
		return "tab";
	}
	
	@RequestMapping(value = "/preview", method = RequestMethod.GET)
	public String tab(@ModelAttribute("Application") Application i,Model model) {
		System.out.println("preview");
		System.out.println(i);
		return "preview";
	}
}
