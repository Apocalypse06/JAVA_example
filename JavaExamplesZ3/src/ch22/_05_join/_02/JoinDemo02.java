package ch22._05_join._02;

public class JoinDemo02 {
	public static void main(String[] args) {
		NewThread ob1 = new NewThread(1, 25000);
		NewThread ob2 = new NewThread(25001, 50000);
		NewThread ob3 = new NewThread(50001, 75000);
		NewThread ob4 = new NewThread(75001, 100000);
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();

		System.out.println("Thread one is alive: " + ob1.isAlive());
		System.out.println("Thread two is alive: " + ob2.isAlive());
		System.out.println("Thread three is alive: " + ob3.isAlive());
		System.out.println("Thread four is alive: " + ob4.isAlive());

		try {
			System.out.println("Waiting for threads to finish.");
			System.out.println("111");
			ob1.join();
			System.out.println("222");
			ob2.join();
			System.out.println("333");
			ob3.join();
			System.out.println("444");
			ob4.join();
			System.out.println("555");

		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted.");
		}

		long sum = ob1.sum + ob2.sum + ob3.sum + ob4.sum;
		System.out.println("The sum of ob1, ob2 and ob3 is : " + sum);

		System.out.println("\n\nThread one is alive: " + ob1.isAlive());
		System.out.println("Thread two is alive: " + ob2.isAlive());
		System.out.println("Thread three is alive: " + ob3.isAlive());
		System.out.println("Thread four is alive: " + ob4.isAlive());
	}
}