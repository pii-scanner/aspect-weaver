package com.citi.cpb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.citi.cpb.annotations.NPII;
import com.citi.cpb.annotations.PII;

public class Customerlog4j {
	@NPII
	private String name;
	private String ssn;
	@PII
	private String aadhar;
	@NPII
    private String driverLicense;
    private String passport;
    @PII
    private String accountNumber;
    private String phoneNo;
    @NPII
    private String address;
    private static Logger logger = LogManager.getLogger(Customerlog4j.class);
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		logger.info("Customer Name {} has registered ",this.name);
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAadhar() {
		return aadhar;
		
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
		logger.info("Aadhar No {} is entered ",this.aadhar);
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args)
	{
		System.out.println("In Main");
		Customerlog4j cust1=new Customerlog4j();
		cust1.setName("Raj Bhise");
		cust1.setAadhar("5421-8569-4758");
		cust1.setSsn("156423478");
		cust1.setPhoneNo("9421807280");
		logger.info("Name is {}",cust1.name);
	}
}
