package ch08._03_CallStack._01;
// ���d�ҥѥD���O��main()�I�ssub1()�I�sFoo#process()�I�sBar#divide()�C
// �bBar#divide()���i��|�o��IndexOutOfBoundsException�ҥ~�A
// �]���bBar#divide()���Q��try-catch-finally�ӳB�z���ҥ~�C
public class CallStack {
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