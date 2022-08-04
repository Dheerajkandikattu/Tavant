package com.org.Autowiring_assign;

import org.springframework.stereotype.Component;

@Component("passport")
public class Passport {
	@Override
	public String toString() {
		return "Passport [passNum=" + passNum + ", dateOfIssue=" + dateOfIssue + ", dateOfExpiry=" + dateOfExpiry + "]";
	}
	private int passNum;
	private String dateOfIssue;
	private String dateOfExpiry;
	public int getPassNum() {
		return passNum;
	}
	public void setPassNum(int passNum) {
		this.passNum = passNum;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	
	

}
