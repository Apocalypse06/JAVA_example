package ch08._03_CallStack._04;
//���d�һP�e�Ҳ������P�ABar#divide()��k�|�o��
//IndexOutOfBoundsException�A�C�������k������
//try-catch-finally�A���L�u���D���O��sub1()��k�~�����즹�ҥ~�A
//���d�ҭ��I�b�[��finally�϶����B�@
public class CallStack {
	static void sub1() {
		System.out.println("�D���O��sub1()��k�}�l");
		try {
			Foo foo = new Foo();
			foo.process();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===>�b�D���O#sub()���B�z�ҥ~�G�}�C����:" + e.getMessage() + "�����D");
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