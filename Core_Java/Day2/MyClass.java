package com.sri;

import java.util.Scanner;

class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	void display() {
		System.out.println("Employee ID:" + employeeId);
		System.out.println("Employee Name:" + employeeName);
		System.out.println("Employee Salary:" + employeeSalary);
	}
}

public class MyClass {

	public static void main(String[] args) {
		Employee obj=new Employee(101,"Sri",10000);
		obj.display();
		Employee obj1=new Employee(102,"Vish",20000);
		obj1.display();
	}

}
