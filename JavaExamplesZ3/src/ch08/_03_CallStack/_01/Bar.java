package ch08._03_CallStack._01;

public class Bar {
	public void divide() {
		System.out.println("Bar���O��divide()��k�}�l");
		int[] xa = {100, 200};
		int sum = 0 ; 
		try {
			for (int i=0; i <= xa.length; i++){
				sum += xa[i];
			}
			System.out.println("�}�C�����[�է����A�`�M=" + sum);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("===>�bBar#divide()���B�z�ҥ~�G�}�C����:" + e.getMessage() + "�����D");
		} finally{
			System.out.println("Bar#divide()��finally�϶�");
		}
		System.out.println("Bar���O��divide()��k����");
	}
}