package ch06._05_encapsulation.accessControl._02protected.anotherPackage;

import ch06._05_encapsulation.accessControl._02protected.CircleProtected;

//�����O�PCircleProtected.java���ݩ�P�@�ӮM��
public class CircleProtectedMain {
	public static void main(String[] args) {
		CircleProtected c = new CircleProtected(30, 20, 20.5);
		c.displayInfo(); // public����
		c.move(+5, -10); // public����
		c.displayInfo(); // public����
		// c.radius = 30;   // protected�����Anot visible
		c.displayInfo();
		// c.getArea();     // default�����Anot visible
		// c.getCircumference(); // not visible�A�]��getCircumference()��private
	}
}