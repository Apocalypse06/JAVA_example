package ch06._05_encapsulation.accessControl._03public;

public class CirclePublicMain {
    public static void main(String[] args) {
        CirclePublic c = new CirclePublic(30, 20, 20.5);
        c.displayInfo();
        c.move(+5, -10);
        c.displayInfo();
        c.radius = -20.5;	//�Ѧ���i�ݥX�@�����O�N�ݩʳ]��public�����I
        c.displayInfo();
    }
}