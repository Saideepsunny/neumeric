package com.hibernate.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.dao.CustomerDaoIfc;
import com.hibernate.persistent.model.Customers;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("hibernate.cfg.xml");
		
		Customers customer = new Customers();
		customer.setAccountnumber(12345);
		customer.setLastName("sunny");
		customer.setFirstName("mandadi");
		customer.setSsn(1234456);
		customer.setAddress("warren pkwy");
		customer.setCity("frisco");
		customer.setState("Texas");
		customer.setZipcode(12345);
		customer.setAccounttype("checking");
		customer.setBalance(1000);
		
		
		CustomerDaoIfc customerdao = (CustomerDaoIfc)context.getBean("customerdao");
		
		/*customerdao.saveCustomerDetails(customer);*/
		
	System.out.println(customerdao.getCustomerDetails(12345).toString());
		
		/*CustomerDaoIfc customerdao = (CustomerDaoIfc)context.getBean("customerdao");
		System.out.println(customerdao.depositAmount(12345, 100));*/
		
		((AbstractApplicationContext) context).close();
	}

}
