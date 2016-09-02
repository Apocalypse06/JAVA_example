package ch06._05_encapsulation.accessControl._02protected;

public class CircleProtected {
// �t��protected�׹��r���ݩʡB��k�B�غc�l�P�������O(�κ٬�����)���i���סG
// ���F�P�@�����O������k�B�غc�l�i�H�ϥΡB�P�@�ӮM�󪺨䥦���O������k�B
// �غc�l�]�i�H�ϥΦ����O��protected�����H�~�A���ݩ�P�@�ӮM����p�G�O
// �����O���l���O�A�䤺����k�B�غc�l�]�i�H�ϥΥ����O��protected�����C
//	
// protected�������i���פ�default�٤j�A���O�p��public
// private�����G�u�������O������k�B�غc�l�i�H�ϥΥ����O��private�����C
// default�����G�u�������O������k�B�غc�l�A���ݩ�P�@�ӮM�󤺪��Ҧ����O��
//           	����k�B�غc�l�i�H�ϥΥ����O��default�����C
// protected����:�����O������k�B�غc�l�A�P�@�ӮM�󤺤����O����k�B�غc�l�A
//          	 ���P�M��A���O�����O���l���O����k�B�غc�l���i�H�����O��
//               protected�����C	
// public����:�S�����󭭨�A����M�󤺤��������O����k�B�غc�l�i�H�ϥ�
//            �����O��public�����C
	protected int x, y;     	// protected�ݩ� 	
	protected double radius;	// protected�ݩ�

	public CircleProtected(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public CircleProtected() {
	}

	public void setOriginal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void move(int distanceX, int distanceY) {
		x += distanceX;
		y += distanceY;
	}

	public void displayInfo() {
		System.out.println("���ꪺ��߬�: (" + x + "," + y + "), �b�|��:" 
		   + radius + ", ���n��:" + getArea() + ", ��P��:" + getCircumference());
	}

	// default��k
	double getArea() {
		return Math.round(Math.PI * radius * radius * 100) / 100.0;
	}
    // private��k
	private double getCircumference() {
		return Math.round(Math.PI * radius * 100) / 100.0;
	}
}
