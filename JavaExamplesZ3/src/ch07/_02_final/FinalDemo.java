package ch07._02_final;

final class FinalClass {
}

class SuperClass {
	final public void aMethod() {
	}
}

class Subclass extends SuperClass {
	// �����O�� aMethod ���~
	// public void aMethod() {
	// }
}

public class FinalDemo {
	// �s�񪫥󪬺A��final�ܼ����b�w�q��
	// (1) �ߧY�]�w�ܼƪ���ȡA�_�h
	// (2) �b�C�ӫغc�l���]�w�������
	//     �C�ӫغc�l�i�H�]�w���P�����
	final int TIMES;

	FinalDemo(int i) {
		TIMES = 100;
	}

	FinalDemo() {
		TIMES = 10;
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo(1);
	}
}