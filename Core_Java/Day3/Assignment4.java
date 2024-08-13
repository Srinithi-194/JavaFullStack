package com.sri;

class Employeess{
	void work() {
		
	}
	void getSalary() {
		
	}
}
class HRManager extends Employeess{
	void work() {
		System.out.println("Work");
	}
	void addEmployee() {
		System.out.println("Employee");
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		HRManager man=new HRManager();
		man.work();
		man.addEmployee();
		
	}

}
