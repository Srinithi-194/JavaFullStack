package com.sri;

public class MyClass3 {
	void Method1() {
		System.out.println("Instance or Object Method");
	}
	static void Method2() {
		System.out.println("Static or class Method");
	}

	public static void main(String[] args) {
		MyClass3 obj=new MyClass3();
		obj.Method1();
		Method2();

	}

}
