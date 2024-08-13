package com.sri;

public class MyClass5 {
	void Method(String name) {
		System.out.println("Welcome" + name);
	}
	
	void Method(int a,int b) {
		System.out.println("Addition:" + (a+b));
	}
	void Method(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		MyClass5 obj=new MyClass5();
		obj.Method(5);
		obj.Method("Sri");
		obj.Method(10,20);
	}

}
