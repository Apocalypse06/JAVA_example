package ch08._03_CallStack._03;
// ���d�һP�e�ҬۦP�A���L�O�b�D���O��->sub1()�B�z�ҥ~�C
public class CallStack {
	static void sub1() {
		System.out.println("�D���O��sub1()��k�}�l");
		try {
			Foo foo = new Foo();
			foo.process();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===>�b�D���O#sub()���B�z��N�ҥ~�G�}�C����:" + e.getMessage() + "�����D");
		} finally {
			System.out.println("CallStack#sub1()��finally�϶�");
		}
		System.out.println("�D���O��sub1()��k����");
	}

	public static void main(String args[]) {
		System.out.println("�{���}�l");
		sub1();
		System.out.println("�{������");
	}
}