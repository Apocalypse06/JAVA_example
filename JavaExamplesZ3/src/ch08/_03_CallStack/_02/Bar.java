package ch08._03_CallStack._02;

public class Bar {
	public void divide() {
		System.out.println("Bar���O��divide()��k�}�l");
		int[] xa = { 100, 200 };
		int sum = 0;
		for (int i = 0; i <= xa.length; i++) {
			sum += xa[i];
		}
		System.out.println("�}�C�����[�է����A�`�M=" + sum);
		System.out.println("Bar���O��divide()��k����");
	}
}