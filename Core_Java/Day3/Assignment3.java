package com.sri;

class Shape{
	void getArea() {
		
	}
}

class Rectangles extends Shape{
	void getArea(int a,int b) {
		int area=a*b;
		System.out.println(area);
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		Rectangles rec=new Rectangles();
		rec.getArea(10,20);

	}

}
