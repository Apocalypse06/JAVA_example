package ch06.lab22.solution;

// 1. Override�m�ߤT�A��i�e�@�ӽm�ߪ����I�C�Ʊ�Service����u�Τ@�Ӥ�k�N��[�`
// �Ҧ��ϧΪ����n�C

// 2. �����ڭ̧Ʊ�o�ǹϧ����O���A�p�⭱�n����k���W�٭n�ۦP�C
// �]���]�p�@�Ӻ٬�Shape�����O�p�U�A�䤺�w�q�@�ӭp�⭱�n����kgetArea()

class Shape {
	public double getArea() {
		return 0;
	}
}

// 3. ���̭��s�]�p�o�ǭ����O�A�ϱo�o�T�����O���OShape���l���O�A�C�����O��
// Override Shape���O��getArea()��k�C

class Rectangle extends Shape  { // �����O Shape ���l���O
	double a, b;

	Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	// �ק惡��k�A����Override Shape���O��getArea() ;
	public double getArea() {
		double area = a * b;
		return area;
	}
}

class Triangle extends Shape{ // �����OShape���l���O
	double a, h;

	Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}
	// �ק惡��k�A����Override Shape���O��getArea() ;
	public double getArea() {
		double area = 0.5 * a * h;
		return area;
	}
}

class Circle extends Shape { // �����OShape���l���O
	double radius;

	Circle(double r) {
		radius = r;
	}
	// �ק惡��k�A����Override Shape���O��getArea() ;
	public double getArea() {
		double area = radius * radius * Math.PI;
		return area;
	}
}

class Service {
	private double totalArea = 0;

// 4. �ק�Service���O�A��Ӫ��T�Ӥ�k�R���A��H�s����k�Ө��N�G
//    �иѶ}�U���|��ԭz�����ѡC	
	public void accumulateArea(Shape x) { // �Ѽ�x�����A����?
		totalArea += x.getArea();     // �z�L �Ѽ�x�Ӱ���a�ڦ@����k     
		System.out.println("�ǤJ������������O:" + x.getClass().getName());
	}
	
// ���A�ݭn��Ӫ��T�Ӥ�k
//	void accumulateRectArea(Rectangle r) {
//		totalArea += r.rectArea();
//	}
//
//	void accumulateCircleArea(Circle c) {
//		totalArea += c.circleArea();
//	}
//
//	void accumulateTriangleArea(Triangle t) {
//		totalArea += t.triArea();
//	}

	public double getTotalArea() {
		return totalArea;
	}
}

// main program
public class FindArea3 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(5, 3);
		Circle c = new Circle(10);
		// �L�X��Ϊ����n
		System.out.println("��Ϊ����n=" + c.getArea());
		// �L�X��Ϊ����n
		System.out.println("��Ϊ����n=" + r.getArea());
		// �L�X�T���Ϊ����n
		System.out.println("�T���Ϊ����n=" + t.getArea());
		// �s�ؤ@�� Service ���O
		Service sv = new Service();
		// �֥[���n�A���έ�Ӫ���k
//		sv.accumulateRectArea(r) ;
//		sv.accumulateCircleArea(c) ;
//		sv.accumulateTriangleArea(t) ;
//    	 ��ηs����k�G�иѶ}�U���T��ԭz�����ѡC
		sv.accumulateArea(r);
		sv.accumulateArea(c);
		sv.accumulateArea(t);
		// �L�X���n���`�M
		System.out.println(" Total Area= " + sv.getTotalArea());
	}
}
// ���G���ק����ۦP�A�u��{���A����OOP���A�h�Ϊ��u�I�C