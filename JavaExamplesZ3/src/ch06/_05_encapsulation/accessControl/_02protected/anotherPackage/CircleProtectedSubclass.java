package ch06._05_encapsulation.accessControl._02protected.anotherPackage;

import ch06._05_encapsulation.accessControl._02protected.CircleProtected;
// �����O�PCircleProtected.java���ݩ�P�@�ӮM��A���L
// �OCircleProtected���O���l���O
public class CircleProtectedSubclass extends CircleProtected {
	public CircleProtectedSubclass(int x, int y, int radius) {
        this.x = x;          
        this.y = y;
        this.radius = radius;
	}
    public void process() {
    	displayInfo(); // public����
		move(+5, -10); // public����
		displayInfo(); // public����
		radius = 30;   // protected����OK�A�]���O�����l���O
		displayInfo();
		// c.getArea();     // default�����Anot visible
		// c.getCircumference(); // not visible�A�]��getCircumference()��private
    }
}
