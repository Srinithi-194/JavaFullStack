package com.sri;
class Animals{
	void move() {
		System.out.println("The animal moves.");
	}
}
class Cheetah extends Animal {
	void move() {
		System.out.println("Cheetah runs");
	}
}

public class Assignment6 {

	public static void main(String[] args) {
		Animals a1 = new Animals();
		a1.move();
		Cheetah c1 = new Cheetah();
		c1.move();

	}

}
