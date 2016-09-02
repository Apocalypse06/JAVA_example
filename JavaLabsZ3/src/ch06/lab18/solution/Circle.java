package ch06.lab18.solution;


public class Circle extends Shape { 
    private double radius;    // ¶êªº¥b®|
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
	    double area = Math.PI * radius * radius; 
		return area;
	}   
}
