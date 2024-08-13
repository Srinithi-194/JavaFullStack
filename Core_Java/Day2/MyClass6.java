package com.sri;

public class MyClass6 {
	MyClass6(String name) {
		System.out.println("Welcome" + name);
	}
	
	MyClass6(int a,int b) {
		System.out.println("Addition:" + (a+b));
	}
	MyClass6(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		MyClass6 obj1=new MyClass6(5);
		MyClass6 obj2=new MyClass6("Sri");
		MyClass6 obj3=new MyClass6(5,10);
		
		

	}

}
