package com.hibernate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hibernate.dao.CustomerDaoIfc;
import com.hibernate.persistent.model.Customers;

@Controller
public class CustomerController {

	@Autowired
	CustomerDaoIfc customerdao;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView newCustomer() {
		ModelAndView mav = new ModelAndView("register", "customers", new Customers());
		return mav;
	}

	@RequestMapping(value = "/customerSave", method = RequestMethod.POST)
	public ModelAndView registerCustomer(@ModelAttribute("customer") Customers customer) {
		customerdao.saveCustomerDetails(customer);
		ModelAndView mav = new ModelAndView("home");

		mav.addObject("message", customer.getLastName() + ".record saved successfully");
		return mav;
	}

	@RequestMapping(value = "/withdraw", method = RequestMethod.GET)
	public ModelAndView getMoney() {
		ModelAndView mav = new ModelAndView("transaction", "customer", new Customers());
		return mav;
	}

	@RequestMapping(value = "/getamount", method = RequestMethod.POST)
	public ModelAndView moneyTransaction(@RequestParam("amount") int amount,
			@ModelAttribute("customer") Customers customer) {
			
		customer.setBalance(amount);
		String s = customerdao.withdrawAmount(customer.getAccountnumber(), amount);

		ModelAndView mav = new ModelAndView("welcome", "message", s);
		return mav;
	}
	
	@RequestMapping(value = "/deposit", method = RequestMethod.GET)
	public ModelAndView addMoney() {
		ModelAndView mav = new ModelAndView("deposit", "customer", new Customers());
		return mav;
	}

	@RequestMapping(value = "/depositamount", method = RequestMethod.POST)
	public ModelAndView depositMoney(@RequestParam("amount") int amount,
			@ModelAttribute("customer") Customers customer) {
			int accountnumber = customer.getAccountnumber();
		String s = customerdao.depositAmount(accountnumber, amount);

		ModelAndView mav = new ModelAndView("welcome", "message", s);
		return mav;
	}
	
	@RequestMapping(value = "/home" , method = RequestMethod.GET)
	public String homepage() {
		return "home";
	}

}
