package ch22._04_create._02_runnable;
public class ThreadCreate2 {
	public static void main(String args[]) {
		HelloRunnable r = new HelloRunnable();
		Thread t1 = new Thread(r, "Kitty");
		t1.start();
		HelloRunnable s = new HelloRunnable();
		Thread t2 = new Thread(s, "Micky");
		t2.start();
	}
}
