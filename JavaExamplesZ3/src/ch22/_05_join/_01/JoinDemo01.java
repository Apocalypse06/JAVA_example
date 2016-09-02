package ch22._05_join._01;

public class JoinDemo01 {
	static public void main(String args[]) {
		NewThread ob1 = new NewThread("Thread one", 1, 20000);
		NewThread ob2 = new NewThread("Thread two", 20001, 40000);
		NewThread ob3 = new NewThread("Thread three", 40001, 60000);
		Thread t1 = new Thread(ob1, "t1");
		Thread t2 = new Thread(ob2, "t2");
		Thread t3 = new Thread(ob3, "t3");
		t1.start();
		t2.start();
		t3.start();

		System.out.println("Thread one is alive: " + t1.isAlive());
		System.out.println("Thread two is alive: " + t2.isAlive());
		System.out.println("Thread three is alive: " + t3.isAlive());

		try {
			System.out.println("Waiting for threads to finish.");
			Thread t = Thread.currentThread();
            System.out.println("�Ӱ���������name=" + t.getName());
			System.out.println("111");
			// main������n��t1�ҹ����������������run()��k�~�వ�U�@�ԭz�A
			// �_�hmain�������������t1�ҹ����������������run()��k�C			
			t1.join();  
			System.out.println("222");
			// main������n��t2�ҹ����������������run()��k�~�వ�U�@�ԭz�A
			// �_�hmain�������������t2�ҹ����������������run()��k�C
			t2.join();
			System.out.println("333");
			// main������n��t3�ҹ����������������run()��k�~�వ�U�@�ԭz�A
			// �_�hmain�������������t3�ҹ����������������run()��k�C
			t3.join();
			System.out.println("444");

		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted.");
		}

		long total = ob1.sum + ob2.sum + ob3.sum;
		System.out.println("The sum of ob1, ob2 and ob3 is : " + total);

		System.out.println("\n\nThread one is alive: " + t1.isAlive());
		System.out.println("Thread two is alive: " + t2.isAlive());
		System.out.println("Thread three is alive: " + t3.isAlive());
	}
}