package ch06.lab20.solution;

// Override�m�ߤ@�A�д����T�����O���O���g�@�ӥi�H�Ǧ^�C�����O�����n����k�A
// ��k�W�٥i�H�ۦ�M�w�C
//
// �b�D���OFindArea���A�U�s�ؤ@�Ӫ���A��ܥ��̪����n�A
// �M��[�`�o�T�Ӫ��󪺭��n

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

// main program
public class FindArea1 {
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
		double total = c.getCircleArea() + r.getRectArea() + t.getTriArea();
		// �L�X���n���`�M
		System.out.println("���n���`�M=" + total);
	}
}