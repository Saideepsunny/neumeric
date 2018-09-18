package com.hibernate.persistent.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ACCT_NO")
	private int accountnumber;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "SSN")
	private int ssn;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "ZipCode")
	private int zipcode;
	
	@Column(name = "ACCT_TYPE")
	private String accounttype;
	
	@Column(name = "BALANCE")
	private int balance;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(int accountnumber, String lastName, String firstName, int ssn, String address, String city,
			String state, int zipcode, String accounttype, int balance) {
		super();
		this.accountnumber = accountnumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.ssn = ssn;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.accounttype = accounttype;
		this.balance = balance;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customers [accountnumber=" + accountnumber + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", ssn=" + ssn + ", address=" + address + ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + ", accounttype=" + accounttype + ", balance=" + balance + "]";
	}

}
