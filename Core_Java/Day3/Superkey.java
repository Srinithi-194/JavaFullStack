package com.sri;

class A{
	int a=10;
	A(String name){
		System.out.println("Welcome" + " " + name);
	}
	void myMethod() {
		System.out.println("I am Super class method");
	}
}
class B extends A{
	B(){
		super("Vish");
	}
	void myMethod2() {
		System.out.println("Super class variable:" +super.a);
		super.myMethod();
	}
}
public class Superkey {
	
	public static void main(String[] args) {
		B b=new B();
		b.myMethod();
		b.myMethod2();
		

	}

}
