package ch08._01;

public class WithoutExceptionHandling {
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