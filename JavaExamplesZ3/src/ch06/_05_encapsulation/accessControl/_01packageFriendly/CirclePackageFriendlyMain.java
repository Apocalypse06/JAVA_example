package ch06._05_encapsulation.accessControl._01packageFriendly;
//�����O�PCirclePackageFriendly.java�ݩ�P�@�ӮM��
public class CirclePackageFriendlyMain {
    public static void main(String[] args) {
        CirclePackageFriendly c = new CirclePackageFriendly(30, 20, 20.5);
        c.displayInfo();
        c.move(+5, -10);
        c.displayInfo();
        c.radius = 30;
        c.displayInfo();
        c.getArea();
        // c.getCircumference();  // not visible�A�]��getCircumference()��private
    }
}