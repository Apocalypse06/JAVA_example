package ch11._02_join._01;

public class JoinDemo01 {
	static public void main(String args[]) {
		Foo ob1 = new Foo(1, 20000);
		Foo ob2 = new Foo( 20001, 40000);
		Foo ob3 = new Foo( 40001, 60000);
		Thread t1 = new Thread(ob1, "t1");
		Thread t2 = new Thread(ob2, "t2");
		Thread t3 = new Thread(ob3, "t3");
		t1.start();
		t2.start();
		t3.start();

		System.out.println("����� t1 �O�_����? " + t1.isAlive());
		System.out.println("����� t2 �O�_����? " + t2.isAlive());
		System.out.println("����� t3 �O�_����? " + t3.isAlive());

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
			System.out.println("Main thread ���_.");
		}

		long total = ob1.sum + ob2.sum + ob3.sum;
		System.out.println("�T�Ӱ�������p���`�M : " + total);

		System.out.println("\n\n����� t1 �O�_����? " + t1.isAlive());
		System.out.println("����� t2 �O�_����? " + t2.isAlive());
		System.out.println("����� t3 �O�_����? " + t3.isAlive());
	}
}