package ch09._05_Generics._06;

public class Rectangle extends Shape { // ���OShape���l���O
	double a, b;
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	// ��Override Shape���O��getArea() ;
	public double getArea() {
		return a * b;
	}
}