package ch07._01_static;

public class StaticDemo {
	public static void main(String args[])  {
		Computer c1 = new Computer(18000);
		Computer c2 = new Computer(16000);
		System.out.println("c1�������ܼ�price����=" + c1.price);
		System.out.println("c2�������ܼ�price����=" + c2.price);
		System.out.println("�z�Lc1�s���R�A�ܼ�listPrice����=" + c1.listPrice);
		System.out.println("�z�Lc2�s���R�A�ܼ�listPrice����=" + c2.listPrice);
		System.out.println("Computer.listPrice=" + Computer.listPrice);
	}
}
