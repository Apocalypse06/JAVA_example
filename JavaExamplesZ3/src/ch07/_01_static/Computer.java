package ch07._01_static;

public class Computer {
	public static int listPrice = 20000;  // �R�A�ܼ�(class/static variable)
	int price;                            // ����ܼ�(instance variable) 
	Computer(int price) {
		this.price = price;
	}
	public static void displayListPrice(){
		System.out.println(listPrice );
	}
}