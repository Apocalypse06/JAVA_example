package ch06._05_encapsulation.accessControl._01packageFriendly;

public class CirclePackageFriendly {
// �S��public, private��protected�׹��r�������٬�PackageFriendly
// (�S��default)�����C
// �ݩ�default���ݩʡB��k�B�غc�l�P�������O(�κ٬�����)���i���סG
// ���F�P�@�����O������k�B�غc�l�i�H�ϥΥ~�A�P�@�ӮM�󤺪��䥦���O
// ������k�B�غc�l�]�i�H�ϥΦ����O��default�����C
// �������Adefault�������i���ץѳ�@���O�����X�i������O���ݪ�
// �M�󤧤��A�ҥH�S�٬�Package Friendly�C
	int x, y;      	// default�ݩ�
	double radius;	// default�ݩ�

	public CirclePackageFriendly(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
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
