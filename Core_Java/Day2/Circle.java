package com.sri;

public class Circle {
	double radius;   
    public Circle(double radius) {
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void printDetails() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
	public static void main(String[] args) {

		Circle obj = new Circle(5.0);
		 System.out.println("Initial Details:");
	        obj.printDetails();

	        obj.setRadius(7.5);

	        System.out.println("\nUpdated Details:");
	        obj.printDetails();
	}

}
