package ch08._02;

public class WithExceptionHandling {
	static void sub1() {
		System.out.println("�D���O��sub1()��k�}�l");
		Foo foo = new Foo();
		foo.process();
		System.out.println("�D���O��sub1()��k����");
	}
	public static void main(String args[]) {
		System.out.println("�{���}�l");
		sub1();
		System.out.println("�{������");
	}
}