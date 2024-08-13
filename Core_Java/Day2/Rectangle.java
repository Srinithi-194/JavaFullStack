package com.sri;

public class Rectangle {
	int height;
	int width;
	void rectangle(int width,int height) {
		int area=height*width;
		int perimeter=2*(width+height);
		System.out.println("Area:" + area);
		System.out.println("Perimeter:" +perimeter);
	}
	

	public static void main(String[] args) {
		Rectangle obj=new Rectangle();
		obj.rectangle(10, 20);
		
		

	}

}
