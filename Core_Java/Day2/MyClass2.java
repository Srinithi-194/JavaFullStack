package com.sri;

public class MyClass2 {
	int b=20;
	static int c=30;

	public static void main(String[] args) {
		int a=10;
		System.out.println("Local Variable:" +a);
		MyClass2 obj=new MyClass2();
		System.out.println(obj.b);
		System.out.println(c);
		

	}

}
