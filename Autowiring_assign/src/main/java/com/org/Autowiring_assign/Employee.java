package com.org.Autowiring_assign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employee")

public class Employee {
	@Autowired
	private Passport passport;
	private int empId;
	private String empName;
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [passport=" + passport.toString() + ", empId=" + empId + ", empName=" + empName + "]";
	}
	
	

}
