package ch06._01_usingObject;

public class BoxMain {
	public static void main(String args[]) {
		Box myBox = new Box();
		Box yourBox = new Box();
		myBox.width = 10;
		myBox.height = 5;
		myBox.depth = 3;
		System.out.println("myBox 的體積=" + myBox.getVolume());
		System.out.println("myBox 的長=" + myBox.width);
		System.out.println("myBox 的高=" + myBox.height);

		yourBox.width = 100;
		yourBox.height = 50;
		yourBox.depth = 30;
		System.out.println("yourBox 的體積=" + yourBox.getVolume());
		System.out.println("yourBox 的長=" + yourBox.width);
		System.out.println("yourBox 的高=" + yourBox.height);
	}
}
