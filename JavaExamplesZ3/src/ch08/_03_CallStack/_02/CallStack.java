package ch08._03_CallStack._02;
// ���d�һP�e�ҬۦP�A�ѥD���O��main()�I�ssub1()�I�sFoo#process()�I�s
// Bar#divide()�A�bBar#divide()���|�o��
// IndexOutOfBoundsException�ҥ~�A���å��bBar#divide()���B�z���ҥ~�A
// �ӬO�bFoo#process()���Q��try-catch-finally�ӳB�z���ҥ~�C
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