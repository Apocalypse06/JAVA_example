package ch08._03_CallStack._02;

public class Foo {
	public void process() {
		System.out.println("Foo���O��process()��k�}�l");
		Bar bar = new Bar();
		try {
			bar.divide();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===>�bFoo#process()���B�z�ҥ~�G�}�C����:" + e.getMessage() + "�����D");
		} finally {
			System.out.println("Foo#process()��finally�϶�");
		}
		System.out.println("Foo���O��process()��k����");
	}
}