package ch22._04_create._02_runnable;
public class HelloRunnable implements Runnable {
	int i = 0;
	public void run() {
		while (true) {
			System.out.print("Name=" + Thread.currentThread().getName());
			System.out.println(",  i=" + i++);
			if (i == 5000)
				break;
		}
	}
}