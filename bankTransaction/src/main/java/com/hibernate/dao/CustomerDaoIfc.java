package com.hibernate.dao;

import com.hibernate.persistent.model.Customers;

public interface CustomerDaoIfc {
	
	public void saveCustomerDetails(Customers customer);
	
	public Customers getCustomerDetails(int accountnumber);
	
	public String withdrawAmount(int accountnumber , int amount);
	
	public String depositAmount(int accountnumber , int amount);

}
