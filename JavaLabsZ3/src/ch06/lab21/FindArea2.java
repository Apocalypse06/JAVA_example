package ch06.lab21;

//  �ӫe�D�A�]�p�@�ӪA�����O Service�A���i�H�[�`�T�عϧΪ����n
//
class Rectangle {
	double a, b;
	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	// �b�o�̳]�p�@�ӯ��X����έ��n����k
	// ���n���� a * b
	public double getRectArea() {
		double area = a * b;
		return area;
	}
}
class Triangle {
	double a, h;
	Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}
	// �b�o�̳]�p�@�ӯ��X�T���έ��n����k
	// ���n���� 0.5 * a * h
	public double getTriArea() {
		double area = 0.5 * a * h;
		return area;
	}
}
class Circle {
	double radius;
	Circle(double r) {
		radius = r;
	}
	// �b�o�̳]�p�@�ӯ��X��έ��n����k
	// ���n���� Math.PI * radius * radius
	public double getCircleArea() {
		double area = radius * radius * Math.PI;
		return area;
	}
}

class Service {
	// �o�O�@�ӪA�����O�A����N���P�ϧΪ��󪺭��n�[�`��totalArea�ܼƤ��A
	// �д��T�عϧΤ��O���g�@�Ӥ�k�G
	// public void accumulateRectArea(Rectangle r):�[�`����Ϊ��󪺭��n���ܼ�totalArea��
	// public void accumulateCircleArea(Circle c):�[�`��Ϊ��󪺭��n���ܼ�totalArea��
	// public void accumulateTriangleArea(Triangle t):�[�`�T���Ϊ��󪺭��n���ܼ�totalArea��
	// ���O�ӥ[�`����Ϊ���B��Ϊ���B�T���Ϊ��󪺭��n��P�@���ܼƤ��C
	// �Q�סG�o�ؤ覡���@�ӯ��I�A�n�����P�Ϊ����O���O�ǳƤ@�Ӥ�k�A�p�G�s�W�@��
	// �Ϊ����O(�p�����)�N�����ק惡���O�C

	private double totalArea = 0;

	public void accumulateRectArea(Rectangle r) {

	}

	public void accumulateCircleArea(Circle c) {

	}

	public void accumulateTriangleArea(Triangle t) {

	}

	public double getTotalArea() {
		return totalArea;
	}
}

// main program
public class FindArea2 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(5, 3);
		Circle c = new Circle(10);
		// �L�X��Ϊ����n
		System.out.println("��Ϊ����n=" + c.getCircleArea());
		// �L�X��Ϊ����n
		System.out.println("��Ϊ����n=" + r.getRectArea());
		// �L�X�T���Ϊ����n
		System.out.println("�T���Ϊ����n=" + t.getTriArea());
		// �p��T�ӧΪ����󪺭��n�`�M
		// �s�ؤ@�� Service ���O
		Service s = new Service();
		// �֥[���n
		s.accumulateRectArea(r);
		s.accumulateCircleArea(c);
		s.accumulateTriangleArea(t);
		// �L�X���n���`�M
		System.out.println("���n���`�M=" + s.getTotalArea());
	}
}