package ch08._04_CheckedException;

public class Foo {
	public void process() {
		System.out.println("Foo���O��process()��k�}�l");
		Bar bar = new Bar();
		try {
			bar.divide();
		} catch (ArithmeticException e) {
			System.out.println("===>�bFoo#process()���B�z��N�ҥ~�G" + e.getMessage());
		} finally {
			System.out.println("Foo#process()��finally�϶�");
		}
		System.out.println("Foo���O��process()��k����");
	}
}