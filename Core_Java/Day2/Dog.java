package com.sri;

public class Dog {
	String name;
	String breed;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	void method1(String name) {
		this.name=name;
	}
	void method2(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println(name);
		System.out.println(breed);
	}
	
	public static void main(String[] args) {
		Dog obj=new Dog("BuBu","Labrador");
		obj.method1("Jack");
		obj.method2("German");
		obj.display();
	}

}
