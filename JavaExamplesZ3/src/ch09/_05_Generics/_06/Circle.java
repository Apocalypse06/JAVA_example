package ch09._05_Generics._06;

public class Circle extends Shape { // ���OShape���l���O
	double radius;

	Circle(double r) {
		radius = r;
	}

	// ��Override Shape���O��getArea() ;
	public double getArea() {
		return 3.14 * radius * radius;
	}
}