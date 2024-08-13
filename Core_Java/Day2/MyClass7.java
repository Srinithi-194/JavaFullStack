package com.sri;

public class MyClass7 {
	MyClass7(String name) {
		System.out.println("Welcome" + name);
	}
	
	MyClass7(int a,int b) {
		this("Sri");
		System.out.println("Addition:" + (a+b));
	}
	MyClass7(int n) {
		this(20,30);
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		MyClass7 obj1=new MyClass7(5);

	}

}
