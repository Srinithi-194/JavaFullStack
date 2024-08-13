package com.sri;


	class Animal{
		void makeSound() {
			System.out.println("Animal makes sound");
		}
	}
	class Cat extends Animal{
		void makeSound() {
			System.out.println("Cat meowss");
		}
	}
	public class Assignment1 {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.makeSound();
		Cat c=new Cat();
		c.makeSound();

	}

}
