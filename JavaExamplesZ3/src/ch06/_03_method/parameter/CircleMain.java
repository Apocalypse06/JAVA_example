package ch06._03_method.parameter;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        // 30, 20���O�ǤJsetOriginal()���Ѽ�newX�PnewY
        c.setOriginal(30, 20);  
        // 20.5�ǤJsetRadius()���Ѽ�r
        c.setRadius(20.5);
        c.displayInfo();
	   // +5, -10���O�ǤJmove()���Ѽ�distanceX�PdistanceY
        c.move(+5, -10);
        c.displayInfo();
    }
}