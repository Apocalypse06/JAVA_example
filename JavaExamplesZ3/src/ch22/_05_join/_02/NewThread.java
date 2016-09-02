package ch22._05_join._02;

public class NewThread extends Thread {
	long sum = 0;
	int startNo, endNo;

	public NewThread(int s, int e) {
		startNo = s;
		endNo = e;
	}

	public void run() {
		System.out.println("Thread " + getName() + " starts");
		for (int i = startNo; i <= endNo; i++)
			sum += i;
		System.out.println("Thread " + getName() + " ends");
	}
}
