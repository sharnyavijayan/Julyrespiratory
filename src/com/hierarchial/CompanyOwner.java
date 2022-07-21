package com.hierarchial;
//child class

public class CompanyOwner extends Employer{
	public void companyOwnerId() {
		System.out.println("ComapnyOwner Id is 345");
	}
	public static void main(String[] args) {
		CompanyOwner cmo= new CompanyOwner ();
		cmo.empId();
		cmo.companyOwnerId();
	}
	}
