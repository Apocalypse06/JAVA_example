package ch06._03_method.parameter;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        // 30, 20だ肚setOriginal()把计newX籔newY
        c.setOriginal(30, 20);  
        // 20.5肚setRadius()把计r
        c.setRadius(20.5);
        c.displayInfo();
	   // +5, -10だ肚move()把计distanceX籔distanceY
        c.move(+5, -10);
        c.displayInfo();
    }
}