package ch22._05_join._01;

public class NewThread implements Runnable {
	String name;
	long sum = 0;
	int startNumber, endNumber;

	NewThread(String name, int startNumber, int endNumber) {
		this.name = name;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " starts. ");
		for (int i = startNumber; i <= endNumber; i++) {
			sum += i;
		}
		System.out.println(Thread.currentThread().getName() + " ends. ");
	}
}
