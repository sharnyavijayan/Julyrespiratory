package com.hierarchial;
//child class
public class ComapnyManager extends Employer{
	public void companyManagerId() {
		System.out.println("ComapnyManager Id is 2453");
	}
	public static void main(String[] args) {
		ComapnyManager cmg= new ComapnyManager ();
		cmg.empId();
		cmg.companyManagerId();
	}
	}
