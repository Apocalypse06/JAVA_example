package ch06._01_usingObject;

public class RefVariableAssignmentMain {
	public static void main(String args[]) {
		Box myBox = new Box();
		myBox.width = 10;
		myBox.height = 5;
		myBox.depth = 3;
		System.out.println("myBox ����n=" + myBox.getVolume());
		System.out.println("myBox ����=" + myBox.width);
		System.out.println("myBox ����=" + myBox.height);
		System.out.println("========================");
        //�z�L�o����ܼƾާ@������O�P�@�Ӫ���(�]������ܼƫ��V�P�@�Ӫ���)
		Box yourBox = myBox;
		yourBox.width = 100;
		System.out.println("myBox ����n=" + myBox.getVolume());
		System.out.println("myBox ����=" + myBox.width);
		System.out.println("myBox ����=" + myBox.height);;
	}
}
