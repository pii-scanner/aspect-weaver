package com.citi.cpb;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.citi.cpb.annotations.NPII;
import com.citi.cpb.annotations.PII;

public class Customer {
	@NPII
	private String name;
	private String ssn;
	private String aadhar;
	@NPII
    private String driverLicense;
    private String passport;
    private String accountNumber;
    @NPII
    private String phoneNo;
    @NPII
    private String address;
//    private static Logger logger = LogManager.getLogger(Customer.class);
    private static final Logger slf4jLogger = LoggerFactory.getLogger(Customer.class);
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		Customer cust=new Customer();
		cust.setName("Raj Bhise");
		cust.setAadhar("5321-8569-4758");
		cust.setSsn("156423478");
		cust.setPhoneNo("9421807280");
		cust.setAccountNumber("2093270566");
		cust.setAddress("India");
		cust.setDriverLicense("DL45785666");
		cust.setPassport("AWS458523W");
		slf4jLogger.info("SLF4JLogger says {}",cust);
	}
}



//@Override
//public final String toString() {
//
//	StringBuilder toString = new StringBuilder();
//	
//	toString.append(this.getClass().getName()).append("[");
//
//	Field[] fields = this.getClass().getDeclaredFields();
//
//	for (int i = 0; i < fields.length; i++) {
//		
//		Field field = fields[i];
//		
//		try {
//			String name = field.getName();
//			Object value;
//
//			if (!Modifier.isPublic(field.getModifiers())) {
//				field.setAccessible(true);
//			}
//			
//			
//			value=field.get(this);
//			
//		
//			toString.append(name).append("=").append(value).append(", ");
//		}
//		catch (IllegalArgumentException | IllegalAccessException e) {
//		}
//	}
//
//	toString.append("]");
//
//	return toString.toString();
//}
