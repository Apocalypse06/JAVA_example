package ch06.lab20;

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

	
	
	
}

class Triangle {
	double a, h;
	Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}
	// �b�o�̳]�p�@�ӯ��X�T���έ��n����k
	// ���n���� 0.5 * a * h
	
	
	
	
}

class Circle {
	double radius;
	Circle(double r) {
		radius = r;
	}
	// �b�o�̳]�p�@�ӯ��X��έ��n����k
	// ���n���� Math.PI * radius * radius
	
	
	
	
}

// main program
public class FindArea1 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(5, 3);
		Circle c = new Circle(10);
		// �L�X��Ϊ����n
//		System.out.println("��Ϊ����n=" + c.�����O�p�⭱�n����k);
//		// �L�X��Ϊ����n
//		System.out.println("��Ϊ����n=" + r.������O�p�⭱�n����k);
//		// �L�X�T���Ϊ����n
//		System.out.println("�T���Ϊ����n=" + t.�T�������O�p�⭱�n����k);
//		// �p��T�ӧΪ����󪺭��n�`�M
//		double total = ...
//		// �L�X���n���`�M
//		System.out.println("���n���`�M=" + total);
	}
}