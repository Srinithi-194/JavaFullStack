package com.sri;
class Vehicle {
	void engine() {
		System.out.println("There is one engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name is honda");
	}
}

class Scooty extends TwoWheeler {
	void brandName() {
		System.out.println("Brand name is activa");
	}
}

public class Singleinherit {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.engine();
		bike.noOfWheels();
		bike.brandName();
		
		
		Scooty scooty=new Scooty();
		scooty.engine();
		scooty.noOfWheels();
		scooty.brandName();
	}

}
