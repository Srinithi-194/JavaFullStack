package com.sri;

public class Person {
	String name;
	int age;
	
	Person(int age,String name){
		this.age=age;
		this.name=name;
	}

	public static void main(String[] args) {
		Person obj=new Person(21,"Sri");
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
