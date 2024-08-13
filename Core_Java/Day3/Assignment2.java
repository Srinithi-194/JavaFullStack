package com.sri;

class Vehicles{
	void drive() {
		
	}
}
class Car extends Vehicles{
	void drive() {
	System.out.println("Repairing a Car");
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		Car a=new Car();
		a.drive();
		

	}

}
