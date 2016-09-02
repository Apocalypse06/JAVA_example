package ch22._04_create._01_thread;

public class HelloThread extends Thread {
	int m = 0;
	int k = 0;
	HelloThread(String name) {
		super(name);
	} 
	public void run() {
		while (true) {
			System.out.print("Name=" + getName());
			if (getName().equalsIgnoreCase("Micky"))
			    System.out.println(",  M=" + m++);
			else {
				System.out.println(",  K=" + k++);
			}
			if (k == 5000)
				break;
			if (m == 5000)
				break;
		}
	}
}