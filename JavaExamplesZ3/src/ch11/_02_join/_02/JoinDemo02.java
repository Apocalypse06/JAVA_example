package ch11._02_join._02;

public class JoinDemo02 {
	public static void main(String[] args) {
		SumThread t1 = new SumThread("t1", 1, 20000);
		SumThread t2 = new SumThread("t2", 20001, 40000);
		SumThread t3 = new SumThread("t3", 40001, 60000);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("����� t1 �O�_����? " + t1.isAlive());
	    System.out.println("����� t2 �O�_����? " + t2.isAlive());
	    System.out.println("����� t3 �O�_����? " + t3.isAlive());
		try {
			System.out.println("Waiting for threads to finish.");
			System.out.println("111");
			t1.join();
			System.out.println("222");
			t2.join();
			System.out.println("333");
			t3.join();
			System.out.println("444");
		} catch (InterruptedException e) {
			System.out.println("Main thread ���_.");
		}

		long total = t1.sum + t2.sum + t3.sum;
		System.out.println("�T�Ӱ�������p���`�M : " + total);
		System.out.println("\n\n����� t1 �O�_����? " + t1.isAlive());
	    System.out.println("����� t2 �O�_����? " + t2.isAlive());
	    System.out.println("����� t3 �O�_����? " + t3.isAlive());
		
	}
}