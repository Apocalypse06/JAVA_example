package ch06._05_encapsulation.accessControl._00private;

public class CirclePrivate {
// �t��private�׹��r���ݩʡB��k�B�غc�l�P�������O(�κ٬�����)���i���סG	
// private�����u�����P�@�����O������k�B�غc�l�ϥΡA���ݩ�P�@�����O
// ������k�B�غc�l������ϥΥ����O��private�����C	
	private int x, y;
	private double radius;

	public CirclePrivate(int x, int y, double radius) {
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

    // private��k�u�����P�@�����O����L��k�I�s
	private double getArea() {
		return Math.round(Math.PI * radius * radius * 100) / 100.0;
	}

	private double getCircumference() {
		return Math.round(Math.PI * radius * 100) / 100.0;
	}
}
