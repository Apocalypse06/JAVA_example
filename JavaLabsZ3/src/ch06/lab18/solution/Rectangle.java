package ch06.lab18.solution;

public class Rectangle extends Shape {
	private double width;   // �x�Ϊ��e(width)
	private double height;  // �x�Ϊ���(height)
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}	
	public double getArea() {
	    double area = width * height; 
		return area;
	}   
}
