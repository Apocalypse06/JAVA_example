package ch06._05_encapsulation.accessControl._03public;

public class CirclePublic {
// �t��public�׹��r���ݩʡB��k�B�غc�l�P�������O(�κ٬�����)�A
// �b�s���W�S�����󭭨�A�Y�P�@�����O�����B���O���~(�S�����O�_�ݩ�
// �P�@�ӮM��P���P�M���ر��p)���i�s���C
// ���O��public�������i���רS�����󭭨�C		
	public int x, y;
	public double radius;	
	public CirclePublic(int x, int y, double radius) {
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
	public void displayInfo(){
		System.out.println("���ꪺ��߬�: (" + x + "," + y + "), �b�|��:" 
	          + radius + ", ���n��:" + getArea() + ", ��P��:" + getCircumference());
	}
	public double getArea() {
		return Math.round(Math.PI * radius * radius * 100 ) / 100.0;
	}
	public double getCircumference() {
		return Math.round(2 * Math.PI * radius * 100 ) / 100.0;
	}
}
