package ch06._04_constructor.thisInCtor;
// ��this�ӰϤ�����ܼƻP�ϰ��ܼ�
public class Circle {
	int x, y;
	double radius;	
	public Circle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
//		setOriginal(x, y);   //OK
//		setRadius(radius);   //OK
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
		return Math.round(Math.PI * radius * 100 ) / 100.0;
	}
}
