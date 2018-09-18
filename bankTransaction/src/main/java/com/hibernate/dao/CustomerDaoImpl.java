package com.hibernate.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.persistent.model.Customers;

@Repository("customerdao")
@Transactional
public class CustomerDaoImpl implements CustomerDaoIfc {

	@Autowired
	SessionFactory sessionFactory;

	public void saveCustomerDetails(Customers customer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(customer);
	}

	public Customers getCustomerDetails(int accountnumber) {
		Session session = sessionFactory.getCurrentSession();
		return (Customers) session.get(Customers.class, accountnumber);
	}

	public String withdrawAmount(int accountnumber, int amount) {
		Session session = sessionFactory.getCurrentSession();
		Customers customer = (Customers) session.get(Customers.class, accountnumber);
		int balance = customer.getBalance();
		if (balance < amount) {
			return "There are not enough funds in you account,your current balance is : $" + balance;
		} else {
			balance = balance - amount;
			customer.setBalance(balance);
			session.update(customer);
			return "your current balance is " + balance;
		}

	}

	public String depositAmount(int accountnumber, int amount) {
		Session session = sessionFactory.getCurrentSession();
		Customers customer = (Customers) session.get(Customers.class, accountnumber);
		int balance = customer.getBalance();
		balance = balance + amount;
		customer.setBalance(balance);
		session.update(customer);
		return "your current balance is " + balance;

	}
}
