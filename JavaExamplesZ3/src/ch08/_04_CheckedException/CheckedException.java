package ch08._04_CheckedException;

// ���d�ҥѥD���O��main()->sub1()->Foo.process()->Bar.divide()
// �bBar.divide()���i��|�o�ͦh��CheckedException�A�]���b
// Bar.divide()���Q��try-
public class CheckedException {
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