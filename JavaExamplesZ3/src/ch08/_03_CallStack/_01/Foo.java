package ch08._03_CallStack._01;

public class Foo {
	public void process() {
		System.out.println("Foo���O��process()��k�}�l");
		Bar bar = new Bar();
		bar.divide();
		System.out.println("Foo���O��process()��k����");
	}
}