package com.sri;

import java.util.Scanner;

class Student{
	int regNo;
	String name;
	int[] arr=new int[5];
	int sum=0;
	float avg=0;
	
	Student(int regNo,String name) {
		this.regNo=regNo;
		this.name=name;
	}
	void getMarks() {
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
	}
	void displayGrade() {
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("RegNo :" + regNo);
		System.out.println("name :" + name);
		avg=(sum/arr.length);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
		if(avg>90) {
			System.out.println("Grade=A");
		}
		else if(avg>=80 || avg<90)
		{
			System.out.println("Grade=B");
		}
		else if(avg>=70 || avg<79) {
			System.out.println("Grade=C");
		}
		else
		{
			System.out.println("Grade=D");
		}
	}
}

public class Assignment {
	

	public static void main(String[] args) {
		Student createobj=new Student(47,"Sri");
		createobj.getMarks();
		createobj.displayGrade();
		

	}

}
